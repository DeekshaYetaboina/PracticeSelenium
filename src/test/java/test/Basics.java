package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {

    @Test
    public void basicTest()
    {
        System.out.println("Hello World");
    }

    @Test
    public void testing()
    {
        System.out.println("hello");
    }
    @BeforeTest
    public void demo(){
        System.out.println("Before Test");
    }
}
