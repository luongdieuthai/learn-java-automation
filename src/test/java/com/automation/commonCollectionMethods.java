package com.automation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface commonCollectionMethods {
      
      //check if array contains duplicate elements
      public boolean containsDuplicate(int[] nums);

      //check if array contains duplicate elements
      public boolean containsDuplicate(String[] strLst);

      //check if array contains subarray
      public boolean containsSubArray(int[] nums, int[] subArray);
      //check if array contains subarray
      public boolean containsSubArray(String[] strings, String[] subArray);

      //check if list contains duplicate elements
      public boolean containsDuplicateInt(List<Integer> nums);

      //check if array list contains duplicate elements
      public boolean containsDuplicateString(List<String> strLst);

      //return value of key if key is present in set  else return null
      public String getValue(Set<String> set, String key);

      //return value of map if key is present in map  else return null
      public String getValue(Map<String, String> map, String key);

      //return element of array with given string
      public String getElement(String[] strLst, String str);

      //return element of map with given string
      public String getElement(Map<String, String> strLst, String str);

      //return element of list with given string
      public String getElement(List<String> strLst, String str);

      //return element of array list with given column,row
      public String getElement(List<String[]> strLst, int column, int row) throws Exception;

      //return element of multi dimensional array with given column,row
      public String getElement(String[][] strLst, int column, int row) throws Exception;
}
