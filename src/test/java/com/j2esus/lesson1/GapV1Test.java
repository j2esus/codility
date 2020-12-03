package com.j2esus.lesson1;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson1.GapV1.getMaxGap;

public class GapV1Test {
    @Test
    public void getGap_whenInputIs1041_return5(){
        assertThat(getMaxGap(1041)).isEqualTo(5);
    }

    @Test
    public void getGap_whenInputIs9_return2(){
        assertThat(getMaxGap(9)).isEqualTo(2);
    }

    @Test
    public void getGap_whenInputIs529_return2(){
        assertThat(getMaxGap(529)).isEqualTo(4);
    }

    @Test
    public void getGap_whenInputIs20_return1(){
        assertThat(getMaxGap(20)).isEqualTo(1);
    }

    @Test
    public void getGap_whenInputIs15_return0(){
        assertThat(getMaxGap(15)).isEqualTo(0);
    }

    @Test
    public void getGap_whenInputIs32_return0(){
        assertThat(getMaxGap(32)).isEqualTo(0);
    }
}
