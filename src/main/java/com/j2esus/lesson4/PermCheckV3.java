package com.j2esus.lesson4;

public class PermCheckV3 {

    /**
     * this method gets 100% in codility, O(n) or O(n * log(n))
     * @param A
     * @return 
     */
    public static int isPermutation(int[] A) {
        long sumDifferences = 0;
        int value, index, maxValue = 0;
        int[] valuesNotRepeated = new int[A.length];
        for(index = 1; index <= A.length; index++){
            value = A[index -1];
            if(isCorrect(value, A.length)){
                if(elementNotExists(value - 1, valuesNotRepeated)){
                    valuesNotRepeated[value - 1] = value;
                    if(value > maxValue) maxValue = value;
                    sumDifferences += (index - value);
                }
            }else{
                sumDifferences = -1;
                break;
            }
        }
        return sumDifferences == 0 && maxValue == (index - 1) ? 1 : 0;
    }
    
    public static boolean isCorrect(int value, int length){
        return value > 0 && value <= length;
    }
    
    public static boolean elementNotExists(int index, int[] array){
        return array[index] == 0;
    }
}