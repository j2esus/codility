package com.j2esus.lesson2;

import com.j2esus.lesson2.CyclicRotation;
import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void cyclicRotationArray_oneRotation(){
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 1;
        
        int[] result = CyclicRotation.cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{6, 3, 8, 9, 7});
    }
    
    @Test
    public void cyclicRotationArray_twoRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 2;

        int[] result = CyclicRotation.cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{7, 6, 3, 8, 9});
    }
    
    @Test
    public void cyclicRotationArray_threeRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 3;

        int[] result = CyclicRotation.cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }
    
    @Test
    public void cyclicRotationArray_fourRotation() {
        int[] data = new int[]{3, 8, 9, 7, 6};
        int numRotations = 4;

        int[] result = CyclicRotation.cyclicRotationArray(data, numRotations);
        assertThat(result).isEqualTo(new int[]{8, 9, 7, 6, 3});
    }
}
