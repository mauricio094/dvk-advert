package divulkaki.com.br.DivulKaki.usecases;

import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SaveAdverts {

    @Autowired
    private AdvertGateway advertGateway;

    public void execute(Advert advert) {
        log.info("Saving Advert: {}", advert);
        advertGateway.save(advert);
    }
}
