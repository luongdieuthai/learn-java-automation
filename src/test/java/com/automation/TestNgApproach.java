package com.automation;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNgApproach {
      @Test
      @Parameters({ "a", "b", "c" })
      public void add(int a, int b, int c) {
            int sum = a + b;
            System.out.println("Sum of two numbers : " + sum);
            Assert.assertEquals(sum, c);
      }

}
