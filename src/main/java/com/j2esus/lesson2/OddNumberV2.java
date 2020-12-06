package com.j2esus.lesson2;

public class OddNumberV2 {

    /**
     * This method got 41% of calification on codility
     * @param A
     * @return
     */
    public static int getOddNumber(int[] A){
        int odd = -1;
        for(int i = 0; i < A.length; i++){
            odd = i;
            int count = 0;
            for(int j = 0; j < A.length; j++){
                if(i == j)
                    continue;
                if(A[i]==A[j]){
                    j = A.length - 1;
                    odd = -1;
                }
                count++;
            }
            if(count == A.length-1)
                break;
        }
        return A[odd];
    }
}
