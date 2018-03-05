package divulkaki.com.br.DivulKaki.domains.exceptions;

import lombok.Getter;

@Getter
public class BusinessLogicException extends DvkAdvertException {
    private static final long serialVersionUID = -7422326575917284053L;

    private Object[] msgParams;

    public BusinessLogicException(String message) {
        super(message);
    }

    public BusinessLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessLogicException(String message, Object... msgParams) {
        super(message);
        this.msgParams = msgParams;
    }

    public BusinessLogicException(String message, Throwable cause, Object[] msgParams) {
        super(message, cause);
        this.msgParams = msgParams;

    }
}
