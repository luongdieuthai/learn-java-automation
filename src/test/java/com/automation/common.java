package com.automation;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class common implements commonMethodInt, commonMethodString, commonCollectionMethods {

      //is prime number
      public boolean isPrimeWhileLoop(int n){
            int i = 2;
            while(i < n){
                  if(n % i == 0){
                        return false;
                  }
                  i++;
            }
            return true;
      }

      public boolean isPrimeDoWhileLoop(int n){
            int i = 2;
            do {
                  if(n % i == 0){
                        return false;
                  }
                  i++;
            } while(i < n);
            return true;
      }

      public boolean isPrimeForLoop(int n){
            for(int i = 2; i < n; i++){
                  if(n % i == 0){
                        return false;
                  }
            }
            return true;
      }

      @Override
      public boolean isPrime(int n) {
            if (n <= 1) {
                  return false;
            }
            for (int i = 2; i < n; i++) {
                  if (n % i == 0) {
                        return false;
                  }
            }
            return true;
      }

      // count prime numbers
      @Override
      public int countPrimes(int n) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                  if (isPrime(i)) {
                        count++;
                  }
            }
            return count;
      }

      // check if substring is present in string
      @Override
      public boolean isSubstring(String str, String sub) {
            if (str.contains(sub)) {
                  return true;
            } else {
                  return false;
            }
      }

      // count substring in string
      @Override
      public int countSubstring(String str, String sub) {
            int count = 0;
            int index = str.indexOf(sub);
            while (index != -1) {
                  count++;
                  index = str.indexOf(sub, index + 1);
            }
            return count;
      }

      // inverse string
      @Override
      public String inverseString(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                  sb.append(str.charAt(i));
            }
            return sb.toString();
      }

      // check if array contains duplicate elements
      @Override
      public boolean containsDuplicate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                  for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] == nums[j]) {
                              return true;
                        }
                  }
            }
            return false;
      }

      // check if array contains duplicate elements
      @Override
      public boolean containsDuplicate(String[] strLst) {
            for (int i = 0; i < strLst.length; i++) {
                  for (int j = i + 1; j < strLst.length; j++) {
                        if (strLst[i].equals(strLst[j])) {
                              return true;
                        }
                  }
            }
            return false;
      }

      // check if array contains subarray
      @Override
      public boolean containsSubArray(int[] nums, int[] subArray) {
            for (int i = 0; i < nums.length - subArray.length + 1; i++) {
                  boolean found = true;
                  for (int j = 0; j < subArray.length; j++) {
                        if (nums[i + j] != subArray[j]) {
                              found = false;
                              break;
                        }
                  }
                  if (found) {
                        return true;
                  }
            }
            return false;
      }

      // check if array contains subarray
      @Override
      public boolean containsSubArray(String[] strings, String[] subArray) {
            for (int i = 0; i < strings.length - subArray.length + 1; i++) {
                  boolean found = true;
                  for (int j = 0; j < subArray.length; j++) {
                        if (!strings[i + j].equals(subArray[j])) {
                              found = false;
                              break;
                        }
                  }
                  if (found) {
                        return true;
                  }
            }
            return false;

      }

      // check if list contains duplicate elements
      @Override
      public boolean containsDuplicateInt(List<Integer> nums) {
            for (int i = 0; i < nums.size(); i++) {
                  for (int j = i + 1; j < nums.size(); j++) {
                        if (nums.get(i) == nums.get(j)) {
                              return true;
                        }
                  }
            }
            return false;
      }

      // check if array list contains duplicate elements
      @Override
      public boolean containsDuplicateString(List<String> strLst) {
            for (int i = 0; i < strLst.size(); i++) {
                  for (int j = i + 1; j < strLst.size(); j++) {
                        if (strLst.get(i).equals(strLst.get(j))) {
                              return true;
                        }
                  }
            }
            return false;
      }


     
      //return value of key if key is present in set  else return null
      @Override
      public String getValue(Set<String> set, String key){
            for(String s:set){
                  if(s.equals(key)){
                        return s;
                  }
            }
            return null;
      }

      //return value of map if key is present in map  else return null
      @Override
      public String getValue(Map<String, String> map, String key){
            for(String s:map.keySet()){
                  if(s.equals(key)){
                        return map.get(s);
                  }
            }
            return null;
      }

      // return element of array with given string
      @Override
      public String getElement(String[] strLst, String str){
            for (int i = 0; i < strLst.length; i++) {
                  if (strLst[i].equals(str)) {
                        return strLst[i];
                  }
            }
            return null;
      }

      // return element of map with given string
      @Override
      public String getElement(Map<String, String> strLst, String str){
            Set<String> keys = strLst.keySet();
            for (String key : keys) {
                  if (key.equals(str)) {
                        return strLst.get(key);
                  }
            }
            return null;
      }

      // return element of list with given string
      @Override
      public String getElement(List<String> strLst, String str){
            for (int i = 0; i < strLst.size(); i++) {
                  if (strLst.get(i).equals(str)) {
                        return strLst.get(i);
                  }
            }
            return null;
      }

      //return element of array list with row, column
      @Override
      public String getElement(List<String[]> strLst, int column, int row) throws Exception {
            try {
                  return strLst.get(row)[column];
            } catch (Exception e) {
                  throw new Exception("Invalid row or column");
            }
      }

      @Override
      public String getElement(String[][] strLst, int column, int row) throws Exception {
            //return element of multi dimentional array  with row, column
            try {
                  return strLst[row][column];
            } catch (Exception e) {
                  throw new Exception("Invalid row or column");
            } 
      }
}
