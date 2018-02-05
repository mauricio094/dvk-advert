package divulkaki.com.br.DivulKaki.gateways.mongodb;

import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import divulkaki.com.br.DivulKaki.gateways.mongodb.repositories.AdvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdvertGatewayImpl implements AdvertGateway {

    @Autowired
    private AdvertRepository advertRepository;

    @Override
    public Advert save(Advert advert) {
        return advertRepository.save(advert);
    }
}
