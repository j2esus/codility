package com.j2esus.lesson3;

public class PermMissingElemV2 {
    
    /**
     * this method gets 100% in codility
     * @param array
     * @return 
     */
    public static int findMissingElement(int[] array) {
        return (int) (sumNumericSequence(array.length + 1) - sumElementsOfArray(array));
    }

    private static long sumNumericSequence(long size) {
        return (size * (++size)) / 2;
    }

    private static long sumElementsOfArray(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
