package com.j2esus.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingIntegerV3 {
    
    /**
     * this method gets 100% in codility, O(n) or O(n * log(n))
     * @param A
     * @return
     */
    public static int solution(int[] A){
        int missing = 1;
        Set<Integer> values = new HashSet<>();
        for(int i = 0; i < A.length; i++)
            values.add(A[i]);
        while(!values.isEmpty()){
            if(values.contains(missing)){
                values.remove(missing);
                missing++;
            }else
                break;
        }
        return missing;
    }
}

