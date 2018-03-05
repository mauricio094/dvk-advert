package divulkaki.com.br.DivulKaki.gateways.http;

import divulkaki.com.br.DivulKaki.domains.exceptions.DvkAdvertException;
import divulkaki.com.br.DivulKaki.domains.exceptions.NotFoundException;
import divulkaki.com.br.DivulKaki.gateways.http.resources.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {


    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON_CHARSET_UTF_8 = "application/json; charset=utf-8";

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public HttpEntity<ErrorResponse> handleNotFoundExcption(HttpServletRequest req, NotFoundException ex) {
        log.error(ex.getMessage(), ex);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.add(CONTENT_TYPE, APPLICATION_JSON_CHARSET_UTF_8);
        return new ResponseEntity<>(createErrorResponse(ex), responseHeader, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DvkAdvertException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public HttpEntity<ErrorResponse> handleThrowable(HttpServletRequest req, DvkAdvertException ex) {
        log.error(ex.getMessage(), ex);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.add(CONTENT_TYPE, APPLICATION_JSON_CHARSET_UTF_8);
        return new ResponseEntity<>(createErrorResponse(ex), responseHeader, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public HttpEntity<ErrorResponse> handleThrowable(HttpServletRequest req, Throwable ex) {
        log.error(ex.getMessage(), ex);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.add(CONTENT_TYPE, APPLICATION_JSON_CHARSET_UTF_8);
        return new ResponseEntity<>(createErrorResponse(ex), responseHeader, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ErrorResponse createErrorResponse(Throwable ex) {
        ErrorResponse errorResponse = null;
        if (StringUtils.isNotBlank(ex.getMessage())) {
            errorResponse = new ErrorResponse(ex.getMessage());
        }
        return errorResponse;
    }
}