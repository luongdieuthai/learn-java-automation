package com.automation;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.management.ManagementFactory;

public class conditionsTestNGIT extends common {

      @BeforeClass
      public void start_testing() {
            System.out.println("start_testing " + ManagementFactory.getRuntimeMXBean().getName());
      }

      @Test(priority = 2,description = "TC1 -- Test if number 13 is prime")
      public void checkIfNumberIsPrime_01() {
            System.out.println("TC1 -- Test if number 13 is prim");
            Assert.assertTrue("This is not a prime", isPrime(13));
      }

      @Test(priority = 3,description = "TC2 -- Test if number 20 is prime")
      public void checkIfNumberIsPrime_02() {
            Assert.assertTrue("This is not a prime", isPrime(20));
      }

      @Test(priority = 4,description = "TC3 -- Test if number 20 is not prime")
      public void checkIfNumberIsNotPrime_01() {
            Assert.assertFalse("This is not a prime", isPrime(20));
      }

      @Test(priority = 5,description = "TC4 -- Test if number 37 is not prime")
      public void checkIfNumberIsNotPrime_02() {
            Assert.assertFalse("This is not a prime", isPrime(37));
      }

      @Test(priority = 1,description = "TC5 -- Test if number \"o W\" is substring of \"Hello World\"")
      public void testIsSubString_01() {
            String a = "Hello World";
            String b = "o W";
            try {
                  Assert.assertTrue(String.format("%s is not a part of %s", b, a), isSubstring(a, b));
            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }
            System.out.println(String.format("\'%s\' is  a part of \'%s\'", b, a));
      }

      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
