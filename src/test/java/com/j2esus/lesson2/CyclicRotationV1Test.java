package com.j2esus.lesson2;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson2.CyclicRotationV1.cyclicRotationArray;
import org.junit.Test;

public class CyclicRotationV1Test {

    @Test
    public void cyclicRotationArray_oneRotation(){
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 1;
        
        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{6, 3, 8, 9, 7});
    }
    
    @Test
    public void cyclicRotationArray_twoRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 2;

        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{7, 6, 3, 8, 9});
    }
    
    @Test
    public void cyclicRotationArray_threeRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 3;

        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }
    
    @Test
    public void cyclicRotationArray_fourRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 4;

        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{8, 9, 7, 6, 3});
    }
    
    @Test
    public void cyclicRotationArray_zeroRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 0;

        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{3, 8, 9, 7, 6});
    }
    
    @Test
    public void cyclicRotationArray_arrayWithFiveElementsAndfiveRotation_returnEqualArray() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 5;

        int[] result = cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{3, 8, 9, 7, 6});
    }
}
