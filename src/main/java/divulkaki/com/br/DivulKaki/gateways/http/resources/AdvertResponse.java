package divulkaki.com.br.DivulKaki.gateways.http.resources;

import com.fasterxml.jackson.annotation.JsonInclude;
import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.AdvertImage;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AdvertResponse {

    private String advertId;
    private String title;
    private String description;
    private List<AdvertImage> advertImages;

    public AdvertResponse(Advert advert) {
        this.advertId = advert.getAdvertId();
        this.title = advert.getTitle();
        this.description = advert.getDescription();
        this.advertImages = advert.getAdvertImages().stream()
                .collect(Collectors.toList());
    }
}

