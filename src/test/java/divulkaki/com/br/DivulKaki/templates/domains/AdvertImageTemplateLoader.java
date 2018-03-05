package divulkaki.com.br.DivulKaki.templates.domains;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import divulkaki.com.br.DivulKaki.domains.AdvertImage;

import static divulkaki.com.br.DivulKaki.templates.FixtureFactoryCore.VALID;

public class AdvertImageTemplateLoader implements TemplateLoader{
    @Override
    public void load() {
        Fixture.of(AdvertImage.class).addTemplate(VALID.name(), new Rule(){{
            add("imageURL","http://static.hogarutil.com/archivos/201209/caqui-fruta-1-xl-668x400x80xX.jpg");
        }});
    }
}
