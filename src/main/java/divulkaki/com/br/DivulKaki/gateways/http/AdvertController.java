package divulkaki.com.br.DivulKaki.gateways.http;

import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.gateways.http.resources.AdvertRequest;
import divulkaki.com.br.DivulKaki.usecases.SaveAdverts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class AdvertController {

    @Autowired
    private SaveAdverts saveAdverts;

    @PostMapping(value = "/advert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void saveAdvert(@RequestBody @Valid final AdvertRequest advertRequest) {
        Advert advert = new Advert();
        advert = advertRequest.toDomain();
        saveAdverts.execute(advert);
    }
}