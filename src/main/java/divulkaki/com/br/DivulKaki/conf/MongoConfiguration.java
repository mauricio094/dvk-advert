package divulkaki.com.br.DivulKaki.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"divulkaki.com.br.DivulKaki.gateways.mongodb"})
@EnableMongoAuditing
public class MongoConfiguration {

}