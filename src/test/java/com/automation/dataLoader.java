package com.automation;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class dataLoader {
      public static String dataLoader(String keyword) {
            // create multi dimensional array
            String[][] dataSet = new String[][] {
                        { "TC1", "val1", "val2" },
                        { "TC2", "val3", "val4" },
                        { "TC3", "val5", "val6" },
                        { "TC4", "val7", "val8" , "val9"}
            };
            String keywordExpresion = "\\$\\{\\_\\w+\\[(\\d+)\\]\\[(\\d+)\\]\\}";
            Pattern pattern = Pattern.compile(keywordExpresion);
            Matcher matcher = pattern.matcher(keyword);
            if(!matcher.matches()) {
                  return keyword;
            }
            int row = Integer.parseInt(matcher.group(1));
            if(row>=dataSet.length) {
                  return keyword;
            }
            int col = Integer.parseInt(matcher.group(2));
            if(col>=dataSet[row].length) {
                  return keyword;
            }

            return dataSet[row][col];
      }

      @Test
      public void testDataLoader1() {
            String value = dataLoader.dataLoader("${getDatadsf}");
            Assert.assertEquals("${getDatadsf}", value);
      }
      @Test
      public void testDataLoader2() {
            String value = dataLoader.dataLoader("${_getData[1][2]}");
            Assert.assertEquals("val4", value);
      }
      @Test
      public void testDataLoader3() {
            String value = dataLoader.dataLoader("${getData[1][2]}");
            Assert.assertEquals("${getData[1][2]}", value);
      }
      @Test
      public void testDataLoader4() {
            String value = dataLoader.dataLoader("${_getDatadsf[1][2]}");
            Assert.assertEquals("val4", value);
      }
      @Test
      public void testDataLoader5() {
            String value = dataLoader.dataLoader("${_getData[1c][2]}");
            Assert.assertEquals("${_getData[1c][2]}", value);
      }
      @Test
      public void testDataLoader6() {
            String value = dataLoader.dataLoader("${_getDatadsf[1][2@]}");
            Assert.assertEquals("${_getDatadsf[1][2@]}", value);
      }
      @Test
      public void testDataLoader7() {
            String value = dataLoader.dataLoader("${_getData![1][2]}");
            Assert.assertEquals("${_getData![1][2]}", value);
      }
      @Test
      public void testDataLoader8() {
            String value = dataLoader.dataLoader("${_getDatadsf[4][2]}");
            Assert.assertEquals("${_getDatadsf[4][2]}", value);
      }
      @Test
      public void testDataLoader9() {
            String value = dataLoader.dataLoader("${_getDatadsf[4][4]}");
            Assert.assertEquals("${_getDatadsf[4][4]}", value);
      }
      @Test
      public void testDataLoader10() {
            String value = dataLoader.dataLoader("${_getDatadsf[2][4]}");
            Assert.assertEquals("${_getDatadsf[2][4]}", value);
      }
      @Test
      public void testDataLoader11() {
            String value = dataLoader.dataLoader("${_getDatadsf[02][2]}");
            Assert.assertEquals("val6", value);
      }
      @Test
      public void testDataLoader12() {
            String value = dataLoader.dataLoader("${_getDatadsf[-2][2]}");
            Assert.assertEquals("${_getDatadsf[-2][2]}", value);
      }
      public static String dataLoaderArray(String keyword) {
            // create multi dimensional array
            String[] dataSet = new String[] { "TC1", "val1", "val2" };
            
            String keywordExpresion = "\\$\\{\\_\\w+\\[(\\d+)\\]\\}";
            
            Pattern pattern = Pattern.compile(keywordExpresion);
            Matcher matcher = pattern.matcher(keyword);
            if(!matcher.matches()) {
                  return keyword;
            }
            int row = Integer.parseInt(matcher.group(1));
            if(row>=dataSet.length) {
                  return keyword;
            }
            return dataSet[row];
      }
      @Test
      public void testDataLoaderArray1() {
            String value = dataLoader.dataLoaderArray("${getDatadsf}");
            Assert.assertEquals("${getDatadsf}", value);
      }
      @Test
      public void testDataLoaderArray2() {
            String value = dataLoader.dataLoaderArray("${_getData[2]}");
            Assert.assertEquals("val2", value);
      }
      @Test
      public void testDataLoaderArray3() {
            String value = dataLoader.dataLoaderArray("${getData[1]}");
            Assert.assertEquals("${getData[1]}", value);
      }
      @Test
      public void testDataLoaderArray4() {
            String value = dataLoader.dataLoaderArray("${_getDatadsf[2]}");
            Assert.assertEquals("val2", value);
      }
      @Test
      public void testDataLoaderArray5() {
            String value = dataLoader.dataLoaderArray("${_getData[1c]}");
            Assert.assertEquals("${_getData[1c]}", value);
      }
      @Test
      public void testDataLoaderArray6() {
            String value = dataLoader.dataLoaderArray("${_getDatadsf[2@]}");
            Assert.assertEquals("${_getDatadsf[2@]}", value);
      }
      @Test
      public void testDataLoaderArray7() {
            String value = dataLoader.dataLoaderArray("${_getData![1]}");
            Assert.assertEquals("${_getData![1]}", value);
      }
      @Test
      public void testDataLoaderArray8() {
            String value = dataLoader.dataLoaderArray("${_getDatadsf[4]}");
            Assert.assertEquals("${_getDatadsf[4]}", value);
      }
      @Test
      public void testDataLoaderArray9() {
            String value = dataLoader.dataLoaderArray("${_getDatadsf[02]}");
            Assert.assertEquals("val2", value);
      }
      @Test
      public void testDataLoaderArray10() {
            String value = dataLoader.dataLoaderArray("${_getDatadsf[-2]}");
            Assert.assertEquals("${_getDatadsf[-2]}", value);
      }
      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
