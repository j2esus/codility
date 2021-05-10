package com.j2esus.lesson3;

public class FrogJmpV1 {
    
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
