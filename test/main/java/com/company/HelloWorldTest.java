package main.java.com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by OLDU on 11/05/2017.
 */
public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void getHello() throws Exception {
        assertEquals("Hello, world!", helloWorld.getHello());
    }

    @Test
    public void setHello() throws Exception {
        helloWorld.setHello("Hello, you ;-)");
        assertEquals("Hello, you ;-)", helloWorld.getHello());
    }

}