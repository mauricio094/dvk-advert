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
        Advert add = new Advert();
        add.setAdvertId(this.getAdvertId());
        add.setTitle(this.getTitle());
        add.setDescription(this.getDescription());
        add.setAdvertImages(this.getAdvertImages());
        return add;
    }
}
