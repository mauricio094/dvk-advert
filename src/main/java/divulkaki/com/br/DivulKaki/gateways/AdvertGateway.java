package divulkaki.com.br.DivulKaki.gateways;

import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.exceptions.NotFoundException;

public interface AdvertGateway {
    Advert save(Advert advert);

    Advert findById(String id) throws NotFoundException;
}
