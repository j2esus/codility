package com.j2esus.lesson3;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;
import static com.j2esus.lesson3.FrogJmpV1.calculateJumps;

public class FrogJmpTestV1 {

    @Test
    public void calculateJumps_return3() {
        assertThat(calculateJumps(10, 85, 30)).isEqualTo(3);
    }
    
    @Test
    public void calculateJumps_return4() {
        assertThat(calculateJumps(100, 180, 20)).isEqualTo(4);
    }
    
    @Test
    public void calculateJumps_return55() {
        assertThat(calculateJumps(70, 344, 5)).isEqualTo(55);
    }
    
    @Test
    public void calculateJumps_return0() {
        assertThat(calculateJumps(1, 1, 3)).isEqualTo(0);
    }
    
}
