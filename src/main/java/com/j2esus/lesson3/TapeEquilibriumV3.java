package com.j2esus.lesson3;

public class TapeEquilibriumV3 {

  /**
   * this method gets 100% in codility, O(n)
   * @param A
   * @return
   */
  public static int getMinimumDifference(int[] A) {
    int limit = A.length - 1;
    int result = Integer.MAX_VALUE, first = 0, second = 0;
    int[] firstPart = new int[limit];
    int[] secondPart = new int[limit];
    for(int i = 1; i <= limit ; i++) {
      first += A[i - 1];
      firstPart[i - 1] = first;
      second += A[limit - (i - 1)];
      secondPart[limit - i] = second;
    }
    for(int j = 0; j < limit; j++){
      int operation = Math.abs(firstPart[j] - secondPart[j]);
      if(operation < result) {
          result = operation;
      }
    }
    
    return result;
  }
}
