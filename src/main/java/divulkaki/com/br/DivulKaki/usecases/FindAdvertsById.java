package divulkaki.com.br.DivulKaki.usecases;


import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.exceptions.NotFoundException;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Optional.*;
import static org.springframework.context.i18n.LocaleContextHolder.getLocale;

@Service
@Slf4j
@AllArgsConstructor
public class FindAdvertsById {

    private final AdvertGateway advertGateway;

    private final MessageSource messageSource;

    public Advert execute(final String id) throws NotFoundException {
        log.info("searching advert with id: {}", id);
        return ofNullable(advertGateway.findById(id))
                .orElseThrow(() -> new NotFoundException(
                        messageSource.getMessage("resource.not.found", null, getLocale())));
    }
}
