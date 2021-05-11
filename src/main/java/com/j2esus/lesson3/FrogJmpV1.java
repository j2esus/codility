package com.j2esus.lesson3;

public class FrogJmpV1 {
    
    /**
     * this method gets 100% in codility
     * @param X
     * @param Y
     * @param D
     * @return 
     */
    public static int calculateJumps(int X, int Y, int D) {
        int exp = (Y - X) / D, sum = 0;
        do{
            sum = X + D * exp;
            if(sum < Y)
                exp++;
        }while(sum < Y);
        return exp;
    }
}
