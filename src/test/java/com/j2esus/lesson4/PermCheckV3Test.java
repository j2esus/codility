package com.j2esus.lesson4;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson4.PermCheckV3.isPermutation;
import org.junit.Test;

public class PermCheckV3Test {

    @Test
    public void isPermutation_itIsWith4Elements_return1() {
        int[] A = {4, 1, 3, 2};
        assertThat(isPermutation(A)).isEqualTo(1);
    }

    @Test
    public void isPermutation_itsNotWith3Elements_return0() {
        int[] A = {4, 1, 3};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
    

    @Test
    public void isPermutation_itIsWith5Elements_return1() {
        int[] A = {4, 1, 3, 5, 2};
        assertThat(isPermutation(A)).isEqualTo(1);
    }

    @Test
    public void isPermutation_itsNotWith5Elements_return0() {
        int[] A = {4, 1, 3, 6, 2};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
    
    @Test
    public void isPermutation_itsNotWith3ElementsButTheSumItsCorrect_return0() {
        int[] A = {1, 4, 1};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
    
    @Test
    public void isPermutation_itsNotWith2ElementsWithIncorrectData_return0() {
        int[] A = {1, 10};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
    
    @Test
    public void isPermutation_repeatValues_return0() {
        int[] A = {1, 2, 2, 1};
        assertThat(isPermutation(A)).isEqualTo(0);
    }
}
