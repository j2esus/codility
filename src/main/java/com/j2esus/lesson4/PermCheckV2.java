package com.j2esus.lesson4;

public class PermCheckV2 {
    
    /**
     * this method gets 83%, O(n) or O(n * log(n))
     * @param A
     * @return 
     */
    public static int isPermutation(int[] A) {
        long sumArray = 0;
        int[] validator = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if(isCorrectValue(A[i], validator)){
                validator[A[i] - 1] = A[i];
                sumArray += A[i];
            }
        }
        return sumArray == sumNumericSequence(A.length) ? 1 : 0;
    }
    
    private static boolean isCorrectValue(int position, int[] validator){
        if(position > 0 && position <= validator.length 
                && validator[position - 1] == 0)
            return true;
        return false;
    }

    private static long sumNumericSequence(int limit) {
        return limit * (++limit) / 2;
    }
}
