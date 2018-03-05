package divulkaki.com.br.DivulKaki.gateways.http.resources;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = -4964705351067869252L;

    private String error;

    public ErrorResponse(String error) {
        this.error = error;
    }
}
