package com.j2esus.lesson3;

public class TapeEquilibriumV1 {
    
    /**
     * this method gets 53% in codility, O(n*n)
     * @param A
     * @return 
     */
    public static int getMinimumDifference(int[] A){
        int minimumValue = 0;
        long sumFirstPart = 0;
        for(int i = 0; i < A.length - 1; i++){
            sumFirstPart += A[i];
            long sumSecondPart = 0;
            for(int j = i + 1; j < A.length; j++)
                sumSecondPart += A[j];
            minimumValue = determinateMinimumValue(i, minimumValue, 
                    Math.abs(sumFirstPart - sumSecondPart));
        }
        return minimumValue;
    }
    
    public static int determinateMinimumValue(int iteration, int minimumValue, 
            long currentValue){
        if(iteration == 0 || currentValue < minimumValue)
            minimumValue = (int) currentValue;
        return minimumValue;
    }
}
