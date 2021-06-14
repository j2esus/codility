package com.j2esus.lesson2;

import java.util.HashMap;
import java.util.Map;

public class OddNumberV1 {

    public static int getOddNumber(int[] data){
        Map<Integer, Integer> filterData = new HashMap<>();
        for(int i = 0; i < data.length; i++){
            int value = data[i];
            if(filterData.containsKey(value))
                filterData.put(value, filterData.get(value)+1);
            else{
                filterData.put(value, 1);
            }
        }
        return filterData.entrySet().stream().filter(x->x.getValue().equals(1))
                .mapToInt(x->x.getKey()).findFirst().orElse(0);
    }
}
