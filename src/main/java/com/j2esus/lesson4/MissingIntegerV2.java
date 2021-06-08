package com.j2esus.lesson4;

public class MissingIntegerV2{

    /**
     * This method gets 66% in codility, O(n**2)
     * @param A
     */
    public static int solution(int[] A){
        int missing = 1;
        int i = 0;
        while(true){
            if(missing == A[i]){
                missing++;
                i = 0;
            }
            if(i == (A.length - 1))
                break;
            i++;
        }
        return missing;
    }
}