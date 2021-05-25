package com.j2esus.lesson4;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson4.PermCheckV1.isPermutation;
import org.junit.Test;

public class PermCheckV1Test {

    @Test
    public void isPermutation_arrayWith4Elements_return1(){
        int[] A = {4, 1, 3, 2};
        assertThat(isPermutation(A)).isEqualTo(1);
    }
    
    @Test
    public void isPermutation_arrayWith3Elements_return0() {
        int[] A = {4, 1, 3};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
    
    @Test
    public void isPermutation_arrayWith5Elements_return1() {
        int[] A = {4, 1, 3, 5, 2};
        assertThat(isPermutation(A)).isEqualTo(1);
    }
    
    @Test
    public void isPermutation_arrayWith5Elements_return0() {
        int[] A = {4, 1, 3, 6, 2};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
}
