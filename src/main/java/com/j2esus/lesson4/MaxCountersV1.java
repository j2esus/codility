package com.j2esus.lesson4;

import java.util.Arrays;

public class MaxCountersV1 {

    /**
     * this method gets 77% in codility, timeout errors
     * @param N
     * @param A
     * @return 
     */
    public static int[] calculate(int N, int[] A){
        int[] maxCounters = new int[N];
        int maxCounter = 0, value, increment;
        for(int i = 0; i < A.length; i++){
            value = A[i];
            if (validatingValueForSum(value, N)) {
                increment = maxCounters[value - 1] + 1;
                maxCounters[value - 1] = increment;
                maxCounter = increment > maxCounter ? increment : maxCounter;
            }else
                Arrays.fill(maxCounters, maxCounter);
        }
        return maxCounters;
    }
    
    public static boolean validatingValueForSum(int value, int N){
        return value <= N && value >= 1;
    }
}
