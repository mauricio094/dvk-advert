package divulkaki.com.br.DivulKaki.templates.domains;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import divulkaki.com.br.DivulKaki.domains.Advert;
import divulkaki.com.br.DivulKaki.domains.AdvertImage;

import java.time.LocalDate;

import static divulkaki.com.br.DivulKaki.templates.FixtureFactoryCore.VALID;

public class AdvertTemplateLoader implements TemplateLoader {
    @Override
    public void load() {
        Fixture.of(Advert.class).addTemplate(VALID.name(), new Rule() {{
            add("advertId", random(String.class));
            add("title", regex("[A-Z]{3}-[0-9]{3}-[0-9]{2}"));
            add("description", "Melhor fruta para se comer");
            add("images", one(AdvertImage.class, VALID.name()));
            add("lastModifiedDate", LocalDate.now());
        }});
    }
}
