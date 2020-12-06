package com.j2esus.lesson2;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson2.OddNumberV3.getOddNumber;

public class OddNumberV3Test {

    @Test
    public void getOddNumber_oddArray_return7(){
        int[] data = {9,3,9,3,9,7,9};
        assertThat(getOddNumber(data)).isEqualTo(7);
    }

    @Test
    public void getOddNumber_oddArray_return11(){
        int[] data = {9,3,9,11,3,9,7,7,9};
        assertThat(getOddNumber(data)).isEqualTo(11);
    }

    @Test
    public void getOddNumber_oddArray_return4(){
        int[] data = {2, 2, 3, 3, 4};
        assertThat(getOddNumber(data)).isEqualTo(4);
    }
}
