package com.j2esus.lesson3;

public class FrogJmpV2 {
    public static int calculateJumps(int X, int Y, int D) {        
        return ((X + D * ((Y - X) / D)) < Y) ? ((Y - X) / D) + 1 : (Y - X) / D;
    }
}
