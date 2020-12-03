package com.j2esus.lesson1;

public class GapV1 {

    public static int getMaxGap(int num){
        char[] array = convertToBinary(num).toCharArray();
        int countZeros = 0;
        int gap = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] == '1'){
                if(countZeros > gap)
                    gap = countZeros;
                countZeros = 0;
            }else{
                countZeros++;
            }
        }
        return gap;
    }

    private static String convertToBinary(int n){
        return Integer.toBinaryString(n);
    }
}
