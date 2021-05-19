package com.j2esus.lesson3;

public class TapeEquilibriumV2 {

    /**
     * this method gets 100% in codility, O(n)
     * @param A
     * @return 
     */
    public static int getMinimumDifference(int[] A) {
        int limit = A.length - 1;
        int indexToLeft = limit;
        long sumFirstPart = 0, sumSecondPart = 0;
        long[] firstPart = new long[limit];
        long[] secondPart = new long[limit];
        for(int indexToRight = 0; indexToRight < limit; indexToRight++){
            sumFirstPart += A[indexToRight];
            sumSecondPart += A[indexToLeft];
            firstPart[indexToRight] = sumFirstPart;
            secondPart[indexToLeft - 1] = sumSecondPart;
            indexToLeft--;
        }
        int minimumValue = 0;
        for(int i = 0; i < limit; i++){
            minimumValue = determinateMinimumValue(i, minimumValue, 
                    Math.abs(firstPart[i] - secondPart[i]));
        }
        
        return minimumValue;
    }
    
    public static int determinateMinimumValue(int iteration, int minimumValue,
            long currentValue) {
        if (iteration == 0 || currentValue < minimumValue) {
            minimumValue = (int) currentValue;
        }
        return minimumValue;
    }
}
