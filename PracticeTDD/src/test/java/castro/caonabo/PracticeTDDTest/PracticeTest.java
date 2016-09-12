package castro.caonabo.PracticeTDDTest;

import castro.caonabo.PracticeTDD.Practice;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/8/16.
 */
public class PracticeTest {



    @Test
    public void PrintingTest(){
        Practice practice = new Practice();
        Assert.assertEquals("should print cat","cat",practice.display());
    }
    @Test
    public void PrintingTest2(){
        Practice practice = new Practice();
        String expected = "dog";
        String actual = practice.display2();
        Assert.assertEquals("should print cat",expected,actual);
    }



}
