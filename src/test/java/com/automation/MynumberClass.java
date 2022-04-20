package com.automation;


import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

public class MynumberClass{
      // is prime number
      private Boolean isPrime = false;
      private int classNumber;
      public static Boolean needToBeInitiated = false;

      public MynumberClass(int n) {
            this.classNumber = n;
            this.isPrime = checkIfPrime();
      }

      public Boolean checkIfPrime() {
            int n= this.classNumber;
            int i = 2;
            while (i < n) {
                  if (n % i == 0) {
                        return false;
                  }
                  i++;
            }
            this.isPrime = true;
            return isPrime;
      }
}
