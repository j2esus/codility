package com.j2esus.lesson2;

import java.util.HashMap;
import java.util.Map;

public class OddNumberV3 {

    /**
     * I found this method on https://coderanch.com/t/666622/java/Odd-Occurrences-Array posted by Yousef Salah
     * @param A
     * @return
     */
    public static int getOddNumber(int[] A){
        Map<Integer,Integer> occurs = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(occurs.containsKey(A[i]) && occurs.get(A[i]) == 1){
                occurs.remove(A[i]);
            }else{
                occurs.put(A[i],1);
            }
        }
        for(int key : occurs.keySet()){
            return key;
        }
        return 0;
    }
}
