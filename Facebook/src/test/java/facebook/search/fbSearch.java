package facebook.search;

/**
 * Created by Shakir on 8/23/2016.
 */
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import java.io.InterruptedIOException;

public class fbSearch extends Base {

    @Test
    public void searchItems() throws InterruptedException{
        typeByCss("#email", "Shakir");
        typeByCss("#pass", "123");
        sleepFor(5);
    }
}

