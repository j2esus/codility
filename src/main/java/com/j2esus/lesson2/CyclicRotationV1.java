package com.j2esus.lesson2;

public class CyclicRotationV1 {

    /**
     * this method gets 87% in codility
     * @param data
     * @param numOfRotation
     * @return 
     */
    public static int[] cyclicRotationArray(int[] data, int numOfRotation){
        for(int k = 0 ; k < numOfRotation ; k++){
            int lastElementOfTheArray = data[data.length - 1];
            int i = (data.length - 1);
            while (i > 0) {
                data[i] = data[i - 1];
                i--;
            }
            data[0] = lastElementOfTheArray;
        }
        return data;
    }
}
