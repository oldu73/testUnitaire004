package main.java.com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by OLDU on 11/05/2017.
 */
public class OperationsTest {
    @Test
    public void add2Numbers() {
        final long addition = Operations.add(10, 20);
        Assert.assertEquals(30, addition);
    }

    @Test
    public void add5Numbers() {
        final long addition = Operations.add(256, 512, 1024, 2048, 4096);
        Assert.assertEquals(7936, addition);
    }

    //@Test
    public void coucou() {
        System.out.println("coucou");
    }

    @Test(expected=IllegalArgumentException.class)
    public void divisionAvecUnNombre() {
        Operations.diviser(1);
    }

    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombresDontUnZero() {
        Operations.diviser(10, 0);
    }

    @Test
    public void divisionAvecDeuxNombres() {
        Assert.assertEquals(3, Operations.diviser(12, 4));
    }

    @Test(timeout=1000)
    public void dureeRespectee() {

    }

    @Test(timeout=1000)
    public void dureeNonRespectee() throws InterruptedException {
        Thread.sleep(10000);
    }

}