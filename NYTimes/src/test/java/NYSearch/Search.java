package NYSearch;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 8/28/2016.
 */
public class Search extends Base {
    @Test
    public void searchNews(){
        clickByCss(".button.search-button");
        typeByCss("#search-input", "Olympic");
        clickByCss(".critical-alerts");
    }
}
