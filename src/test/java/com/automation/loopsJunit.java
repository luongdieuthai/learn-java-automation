package com.automation;

import org.junit.Assert;
import org.junit.Test;

import java.lang.management.ManagementFactory;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class loopsJunit {
      /**
       * Java Loops Test :-)
       */
      private commonMethodInt myMethodInt = new common();
  

      @Before
      public void start_testing() {
            System.out.println("start_testing " + ManagementFactory.getRuntimeMXBean().getName());
      }

      @Test
      public void checkIfNumberIsPrime_01() {
            System.out.println("checkIfNumberIsPrime_01");
            Assert.assertTrue("This is not a prime", myMethodInt.isPrime(13));
      }


      public void checkIfNumberIsPrime_02() {
            Assert.assertTrue("This is not a prime", myMethodInt.isPrime(20));
      }

      @Test
      public void checkIfNumberIsNotPrime_01() {
            Assert.assertFalse("This is a prime", myMethodInt.isPrime(20));
      }

      @Test
      public void checkIfNumberIsNotPrime_02() {
            Assert.assertFalse("This is a prime", myMethodInt.isPrime(37));
      }

      @Test
      public void checkIfCastInterfaceWork() {
            //cast to another interface
            commonMethodString myMethodString = (commonMethodString) myMethodInt;
            Assert.assertTrue(myMethodString instanceof commonMethodInt);
            Assert.assertEquals("Both strings are not the same","AMT", myMethodString.inverseString("TMA"));
      }


      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
