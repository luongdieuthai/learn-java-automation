package com.automation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;
/**
 * Unit test for simple App.
 */
public class dataTypeJunit 
{
    @Before
    public void start_testing() {
          System.out.println("start_testing");
    }

    @Test
    public void practicing_test_01() {
          int a = 5;
          int b = 3;
          int c = 8;
          System.out.println("Practice test 1");
          Assert.assertTrue("Failed result!!",a+b>c);
    }

    @Test
    public void practicing_test_02() {
          float a = 5;
          int b = 3;
          int c = 8;
          System.out.println("Practice test 2");
          Assert.assertTrue(a+b==c);
    }

    @AfterClass
    public static void end_testing() {
          System.out.println("end_testing");
    }
}
