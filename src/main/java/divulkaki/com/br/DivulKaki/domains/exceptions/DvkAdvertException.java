package divulkaki.com.br.DivulKaki.domains.exceptions;

import lombok.Getter;

@Getter
public class DvkAdvertException extends Exception {

    private static final long serialVersionUID = -3272804038009320324L;

    private Object[] msgParams;

    public DvkAdvertException(String message) {
        super(message);
    }

    public DvkAdvertException(String message, Throwable cause) {
        super(message,cause);
    }

    public DvkAdvertException(String message, Object... msgParams) {
        super(message);
        this.msgParams = msgParams;
    }

    public DvkAdvertException(String message, Throwable cause, Object[] msgParams) {
        super(message, cause);
        this.msgParams = msgParams;
    }
}
