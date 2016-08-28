package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import java.io.InterruptedIOException;

/**
 * Created by Shakir on 8/22/2016.
 */
public class Search extends Base {

    @Test
    public void searchItems() throws InterruptedException{
        typeByCss("#twotabsearchtextbox", "Laptop");
        sleepFor(5);
        showTitle();
    }
    @Test
    public void showTitle()
    {

        System.out.println(driver.getTitle());
    }
}
