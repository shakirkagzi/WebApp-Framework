package news.page;

/**
 * Created by Shakir on 8/28/2016.
 */
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import java.io.InterruptedIOException;


public class News extends Base {

    @Test
    public void searchItems() throws InterruptedException{
        typeByCss("#search-input-field", "Political");
        sleepFor(5);
    }

}
