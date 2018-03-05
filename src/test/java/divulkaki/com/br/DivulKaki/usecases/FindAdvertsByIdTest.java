package divulkaki.com.br.DivulKaki.usecases;

import br.com.six2six.fixturefactory.Fixture;
import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.exceptions.DvkAdvertException;
import divulkaki.com.br.DivulKaki.domains.exceptions.NotFoundException;
import divulkaki.com.br.DivulKaki.gateways.AdvertGateway;
import divulkaki.com.br.DivulKaki.test.support.TestSupport;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static divulkaki.com.br.DivulKaki.templates.FixtureFactoryCore.VALID;
import static org.mockito.Mockito.*;

public class FindAdvertsByIdTest extends TestSupport {

    @InjectMocks
    private FindAdvertsById findAdvertsById;

    @Mock
    private AdvertGateway advertGateway;

    private Advert advert;

    public void init() {
        advert = Fixture.from(Advert.class).gimme(VALID.name());
    }

    @Test
    public void execute() throws NotFoundException {
        String id = "000";
        when(advertGateway.findById(id)).thenReturn(advert);

        Advert advertOne = findAdvertsById.execute(id);

        verify(advertGateway, only()).findById(id);
        Assert.assertEquals(advertOne.getTitle(), "Anuncio de Testes");
    }
}