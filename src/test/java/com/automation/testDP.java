package com.automation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.automation.DP;

public class testDP {
      @Test(dataProvider = "internal-data-provider"
      //, dataProviderClass = DP.class
      )
      public void myTest(int a, int b, int result) {
            Assert.assertEquals(a - b, result);
      }
      @Test(dataProvider = "internal-data-provider"
      //, dataProviderClass = DP.class
      )      public void Sum (int a, int b, int result) {
           int sum = a + b;
           Assert.assertEquals(result, sum);
      }
       
      @Test(dataProvider = "internal-data-provider"
      //, dataProviderClass = DP.class
      )     public void Diff (int a, int b, int result) {
           int diff = a - b;
           Assert.assertEquals(result, diff);
      }

      @DataProvider (name = "internal-data-provider")
           public Object[][] dpMethod(){
      	 return new Object[][] {{3,6,9}, {5,7,12}};
           }
}
