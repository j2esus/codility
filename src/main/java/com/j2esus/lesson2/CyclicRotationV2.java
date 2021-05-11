package com.j2esus.lesson2;

public class CyclicRotationV2 {
    
    /**
     * this method gets 62% in codility
     * @param data
     * @param numOfRotation
     * @return
     */
    public static int[] cyclicRotationArray(int[] data, int numOfRotation) {
        int[] newData = new int[data.length];
        int limit = data.length - numOfRotation;
        for(int i = 0; i < data.length; i++){
            if(i < limit){
                newData[numOfRotation] = data[i];
                numOfRotation++;
            }
            else{
                newData[i - limit] = data[i];
            }
        }
        return newData;
    }
}
