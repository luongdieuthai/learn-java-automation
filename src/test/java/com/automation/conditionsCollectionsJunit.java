package com.automation;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class conditionsCollectionsJunit {
      /**
       * Java Conditions Test :-)
       */
      private String contextString = "";
      private commonCollectionMethods colMed;

      public conditionsCollectionsJunit() {
            super();
            contextString = "${_onTestCaseData.[i].[j]}";
            colMed = new common();
      }

      @Before
      public void start_testing() {
            System.out.println("start_testing " + ManagementFactory.getRuntimeMXBean().getName());
      }

      @Test
      // create hashmap
      public void checkMap() {
            // Map<String, String> map = new HashMap<String, String>();

      }
      
      public static String dataLoader(String keyword) {
            // create multi dimensional array
            String[][] dataSet = new String[][] {
                        { "TC1", "val1", "val2" },
                        { "TC2", "val3", "val4" },
                        { "TC3", "val5", "val6" }
            };
            String keywordExpresion = "\\$\\{\\_\\w+\\[(\\d+)\\]\\[(\\d+)\\]\\}";
            // contextString = String.format("${_onTestCaseData.[%d].[%d]}", 1, 2);
            
            Pattern pattern = Pattern.compile(keywordExpresion);
            Matcher matcher = pattern.matcher(keyword);
            if(!matcher.matches()) {
                  return keyword;
            }
            int row = Integer.parseInt(matcher.group(1));
            int col = Integer.parseInt(matcher.group(2));

            return dataSet[row][col];
      }

      @Test
      public void testDataLoader1() {
            String value = conditionsCollectionsJunit.dataLoader("${getDatadsf}");
            Assert.assertEquals("${getDatadsf}", value);
      }
      @Test
      public void testDataLoader2() {
            String value = conditionsCollectionsJunit.dataLoader("${_getData[1][2]}");
            Assert.assertEquals("val4", value);
      }
      @Test
      public void testDataLoader3() {
            String value = conditionsCollectionsJunit.dataLoader("${getData[1][2]}");
            Assert.assertEquals("${getData[1][2]}", value);
      }
      @Test
      public void testDataLoader4() {
            String value = conditionsCollectionsJunit.dataLoader("${_getDatadsf[1][2]}");
            Assert.assertEquals("val4", value);
      }

      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
