package test.java.primefactors;

import main.java.primefactor.PrimeFactor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
/**
 * Created by Mircea
 */
public class PrimeFactorTest {
    private PrimeFactor factorisation;

    @Before
    public void setUp() {
        factorisation = new PrimeFactor();
    }


    @After
    public void tearDown() {

    }

    @Test
    public void betterTest() throws Exception {
        Assert.assertEquals(Arrays.asList(), factorisation.primeDecompositionOf(1));
        Assert.assertEquals(Arrays.asList(2), factorisation.primeDecompositionOf(2));
        Assert.assertEquals(Arrays.asList(3), factorisation.primeDecompositionOf(3));
        Assert.assertEquals(Arrays.asList(2, 2), factorisation.primeDecompositionOf(4));
        Assert.assertEquals(Arrays.asList(5), factorisation.primeDecompositionOf(5));
        Assert.assertEquals(Arrays.asList(2, 3), factorisation.primeDecompositionOf(6));
        Assert.assertEquals(Arrays.asList(2, 2, 2), factorisation.primeDecompositionOf(8));
        Assert.assertEquals(Arrays.asList(3, 3), factorisation.primeDecompositionOf(9));
        Assert.assertEquals(Arrays.asList(2, 3,  5, 11), factorisation.primeDecompositionOf(2 * 3 *  5 * 11));
        Assert.assertEquals(Arrays.asList(2, 2, 2, 2, 2, 3, 5, 7, 11, 13, 15), factorisation.primeDecompositionOf(2 * 2 * 2 * 2 * 2 * 3 * 5 * 7 * 11 * 13 * 15 ));
    }

}