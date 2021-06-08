package com.j2esus.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingIntegerV1 {
    
    /**
     * this method gets 33% in codility
     * @param A
     * @return
     */
    public static int solution(int[] A){
        int positiveSum = 0, maxValue = 0, negativeSum = 0;
        Set<Integer> uniqueValues = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            int index = A[i];
            maxValue = index > maxValue ? index : maxValue;
            if(!uniqueValues.contains(index)){
                if(index > 0)
                    positiveSum += A[i];
                else
                    negativeSum += A[i];
                uniqueValues.add(index);
            }
        }
        return positiveSum == 0 && negativeSum < 0 ? 1 : 
            sumNumericSequence(maxValue) - positiveSum == 0 ? maxValue + 1 :
            sumNumericSequence(maxValue) - positiveSum ;
    }

    public static int sumNumericSequence(int value){
        return value * (value + 1) / 2;
    }
}
