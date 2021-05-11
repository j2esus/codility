package com.j2esus.lesson3;

public class PermMissingElemV1 {

    /**
     * this method gets 80% in codility
     * @param array
     * @return 
     */
    public static int findMissingElement(int[] array){
        return sumNumericSequence(array.length + 1) - sumElementsOfArray(array);
    }
    
    private static int sumNumericSequence(int size){
        return (size * (++size)) / 2;
    }
    
    private static int sumElementsOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }
}
