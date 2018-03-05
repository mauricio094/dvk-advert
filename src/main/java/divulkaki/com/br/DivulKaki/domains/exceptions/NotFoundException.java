package divulkaki.com.br.DivulKaki.domains.exceptions;

import lombok.Getter;

@Getter
public class NotFoundException extends DvkAdvertException {
    private static final long serialVersionUID = -6133263036152675961L;

    private Object[] msgParams;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(String message, Object... msgParams) {
        super(message);
        this.msgParams = msgParams;
    }

    public NotFoundException(String message, Throwable cause, Object[] msgParams) {
        super(message, cause);
        this.msgParams = msgParams;
    }
}
