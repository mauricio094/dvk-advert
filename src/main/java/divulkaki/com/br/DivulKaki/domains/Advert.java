package divulkaki.com.br.DivulKaki.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@ToString(exclude = {"lastModifiedDate"})
@Document(collection = "adverts")
@TypeAlias("Advert")

public class Advert implements Serializable {

    @Getter
    @Setter
    @Id
    private String advertId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private List<AdvertImage> advertImages;

    @Getter
    @LastModifiedDate
    private LocalDate lastModifiedDate;
}
