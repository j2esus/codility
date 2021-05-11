package com.j2esus.lesson3;

public class FrogJmpV2 {
    
    /**
     * this method gets 100% in codility
     * @param X
     * @param Y
     * @param D
     * @return 
     */
    public static int calculateJumps(int X, int Y, int D) {        
        return (X + D * ((Y - X) / D)) < Y ? (Y - X) / D + 1 : (Y - X) / D;
    }
}
