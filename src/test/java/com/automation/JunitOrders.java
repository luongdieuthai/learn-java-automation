package com.automation;


import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitOrders {

      @BeforeClass
      public static void start_testing() {
            System.out.println("start_testing");
      }

      @Test
      public void testAcreate() {
            System.out.println("first");
      }

      @Test
      public void testBupdate() {
          System.out.println("second");
      }

      @Test
      public void testCdelete() {
            System.out.println("third");
      }
}
