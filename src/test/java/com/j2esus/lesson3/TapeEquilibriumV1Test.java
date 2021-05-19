package com.j2esus.lesson3;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;
import static com.j2esus.lesson3.TapeEquilibriumV1.getMinimumDifference;

public class TapeEquilibriumV1Test {

    @Test
    public void getMiminumDifference_return1(){
        int[] A = {3, 1, 2, 4, 3};
        assertThat(getMinimumDifference(A)).isEqualTo(1);
    }
    
    @Test
    public void getMiminumDifference_return8() {
        int[] A = {4, 2, 6, 9, 11};
        assertThat(getMinimumDifference(A)).isEqualTo(8);
    }
    
    @Test
    public void getMiminumDifference_emptyArray_return0() {
        int[] A = {};
        assertThat(getMinimumDifference(A)).isEqualTo(0);
    }
    
    @Test
    public void getMiminumDifference_return460621() {
        int[] A = {154851,615472};
        assertThat(getMinimumDifference(A)).isEqualTo(460621);
    }
    
    @Test
    public void getMiminumDifference_return0() {
        int[] A = {2, 1, 1};
        assertThat(getMinimumDifference(A)).isEqualTo(0);
    }
}
