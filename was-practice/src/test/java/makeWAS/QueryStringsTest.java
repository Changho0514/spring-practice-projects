package makeWAS;

import makeWAS.QueryStrings;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringsTest {

    @Test
    void createTest() {
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55"); //List<makeWAS.QueryString>

        assertThat(queryStrings).isNotNull();
    }
}
