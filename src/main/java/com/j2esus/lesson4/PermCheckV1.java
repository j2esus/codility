package com.j2esus.lesson4;

public class PermCheckV1 {

    /**
     * this method gets 66% in codility 
     * @param A
     * @return 
     */
    public static int isPermutation(int[] A){
        long sumArray = 0;
        for(int i = 0; i < A.length; i++)
            sumArray += A[i];
        return sumArray == sumNumericSequence(A.length) ? 1 : 0;
    }
    
    private static long sumNumericSequence(int limit){
        return limit * (++limit) / 2;
    }
}
