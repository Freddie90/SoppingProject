package com.List;

import static org.junit.Assert.assertTrue;


import junit.framework.TestCase;
//import org.junit.Test;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */

    public AppTest(String testName){super (testName);}

    public static Test suite(){return new TestSuite(AppTest.class);}

    public void testApp(){assertTrue(true);}
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
}
