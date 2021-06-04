package com.j2esus.lesson4;

public class MaxCountersV2 {

    /**
     * this method gest 100% in codility
     * I was not be able to get this solution by myself, I had to search 
     * on internet and I found the solution in next link:
     * https://stackoverflow.com/questions/19465965/java-codility-max-counters
     * @param N
     * @param A
     * @return
     */
    public static int[] calculate(int N, int[] A) {
        int[] maxCounters = new int[N];
        int value = 0, maxCounter = 0, minCounter = 0;
        for(int i = 0; i < A.length; i++){
            value = A[i];
            if(validatingValueForSum(value, N)){
                int index = value - 1;
                if(maxCounters[index] < minCounter) 
                    maxCounters[index] = minCounter;
                maxCounters[index] = maxCounters[index] + 1;
                maxCounter = maxCounters[index] > maxCounter ? maxCounters[index] : maxCounter;
            }else{
                minCounter = maxCounter;
            }
        }
        for(int i = 0; i < maxCounters.length; i++){
            if(maxCounters[i] < minCounter )
                maxCounters[i] = minCounter;
        }
        return maxCounters;
    }

    public static boolean validatingValueForSum(int value, int N){
        return value <= N && value >= 1;
    }
}
