package com.j2esus.lesson1;

public class GapV2 {
    public static int getMaxGap(int n ){
        n >>>= Integer.numberOfTrailingZeros(n) + 1;
        int gap = 0;
        while(n > 0){
            int countZeros = Integer.numberOfTrailingZeros(n);
            gap = countZeros > gap ? countZeros : gap;
            n >>>= countZeros + 1;
        }
        return gap;
    }
}
