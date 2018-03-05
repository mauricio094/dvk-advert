package divulkaki.com.br.DivulKaki.gateways.mongodb.repositories;

import divulkaki.com.br.DivulKaki.domains.Advert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends MongoRepository<Advert, String> {
}
