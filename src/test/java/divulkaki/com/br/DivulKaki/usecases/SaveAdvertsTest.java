package divulkaki.com.br.DivulKaki.usecases;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static divulkaki.com.br.DivulKaki.templates.FixtureFactoryCore.VALID;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SaveAdvertsTest {

    @InjectMocks
    SaveAdverts saveAdverts;

    @Mock
    AdvertGateway advertGateway;

    private Advert advert;

    public void init() {
        FixtureFactoryLoader.loadTemplates("divulkaki.com.br.DivulKaki.templates");
        advert = Fixture.from(Advert.class).gimme(VALID.name());
    }

    @Test
    public void execute() throws Exception {
        saveAdverts.execute(advert);
        verify(advertGateway).save(advert);
    }

}