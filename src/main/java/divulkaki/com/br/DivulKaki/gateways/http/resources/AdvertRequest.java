package divulkaki.com.br.DivulKaki.gateways.http.resources;

import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.AdvertImage;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;
@Data
public class AdvertRequest {

    @NotEmpty
    private String advertId;
    @NotEmpty
    private String title;
    @NotEmpty
    private String description;
    private List<AdvertImage> advertImages;

    public Advert toDomain() {
        Advert advert = new Advert();
        advert.setAdvertId(this.getAdvertId());
        advert.setTitle(this.getTitle());
        advert.setDescription(this.getDescription());
        advert.setAdvertImages(this.getAdvertImages());
        return advert;
    }
}
