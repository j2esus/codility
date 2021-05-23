package com.j2esus.lesson4;

public class FrogRiverOneV1 {
    
    /**
     * This method gets 100% in codility, O(n)
     * @param X
     * @param A
     * @return 
     */
    public static int crossTheRiver(int X, int[] A){
        int sumDistance = 0, minimalTime = -1;
        int[] validator = new int[X + 1];
        for(int i = 0; i < A.length; i++){
            if(validator[A[i]] == 0){
                validator[A[i]] = A[i];
                sumDistance += A[i];
                if (distanceIsComplete(sumDistance, X)) {
                    minimalTime = i;
                    break;
                }
            }
        }
        return minimalTime;
    }
    
    private static int sumSequence(int X){
        return (X * (X + 1)) / 2;
    }
    
    private static boolean distanceIsComplete(int sumDistance, int X){
        return sumDistance == sumSequence(X);
    }
}
