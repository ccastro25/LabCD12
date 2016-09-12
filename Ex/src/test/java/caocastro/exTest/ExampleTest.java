package caocastro.exTest;

import caoncastro.ex.Example;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/8/16.
 */
public class ExampleTest {

    @Test
    public void runningTest(){

        Example example = new Example();

        String input ="spring";
        String expected= "spring";

        Assert.assertEquals("Should print the word spring",input,expected);
    }

    @Test
    public void runningTest2(){

        Example example = new Example();

       int input =4;
        int expected= 4;

        Assert.assertEquals("Should print the word spring",input,expected);
    }
}
