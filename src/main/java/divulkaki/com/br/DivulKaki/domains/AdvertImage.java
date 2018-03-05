package divulkaki.com.br.DivulKaki.domains;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdvertImage implements Serializable {
    private static final long serialVersionUID = -75015800430224197L;
    private String imageURL;
}
