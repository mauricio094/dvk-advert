package divulkaki.com.br.DivulKaki.usecases;

import br.com.six2six.fixturefactory.Fixture;
import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import divulkaki.com.br.DivulKaki.test.support.TestSupport;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static divulkaki.com.br.DivulKaki.templates.FixtureFactoryCore.VALID;
import static org.mockito.Mockito.verify;

public class SaveAdvertsTest extends TestSupport {

    @InjectMocks
    SaveAdverts saveAdverts;

    @Mock
    AdvertGateway advertGateway;

    private Advert advert;

    public void init() {
        advert = Fixture.from(Advert.class).gimme(VALID.name());
    }

    @Test
    public void execute() throws Exception {
        saveAdverts.execute(advert);
        verify(advertGateway).save(advert);
    }

}