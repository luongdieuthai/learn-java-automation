package com.automation;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DP {
      @DataProvider(name = "data-provider")
      // public Object[][] dpMethod(){
      // return new Object[][] {{3,6,9}, {5,7,12}};
      // }
      public Object[][] dpMethod(Method m) {
            switch (m.getName()) {
                  case "Sum":
                        return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } };
                  case "Diff":
                        return new Object[][] { { 2, 3, -1 }, { 5, 7, -2 } };
            }
            return null;

            // @Test (dataProvider = "data-provider")
            // public void myTest (String val) {
            // System.out.println("Passed Parameter Is : " + val);
      }
}