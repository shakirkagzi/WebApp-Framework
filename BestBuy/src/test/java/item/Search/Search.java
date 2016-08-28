package item.Search;

/**
 * Created by Shakir on 8/28/2016.
 */
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import java.io.InterruptedIOException;

public class Search extends Base {

    @Test
    public void searchItems() throws InterruptedException{
        typeByCss("#gh-search-input", "movies");
        sleepFor(5);
    }
}

