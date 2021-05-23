package com.j2esus.lesson4;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;
import static com.j2esus.lesson4.FrogRiverOneV1.crossTheRiver;

public class FrogRiverOneV1Test {
    
    @Test
    public void crossTheRiver_return6(){
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        assertThat(crossTheRiver(X, A)).isEqualTo(6);
    }
    
    @Test
    public void crossTheRiver_missingLeaveInPosition2_returnNegative1() {
        int X = 6;
        int[] A = {1, 3, 6, 4, 5};
        assertThat(crossTheRiver(X, A)).isEqualTo(-1);
    }
    
    @Test
    public void crossTheRiver_return4() {
        int X = 4;
        int[] A = {1, 2, 2, 3, 4};
        assertThat(crossTheRiver(X, A)).isEqualTo(4);
    }
    
    @Test
    public void crossTheRiver_return10() {
        int X = 9;
        int[] A = {1, 3, 3, 2, 5, 5, 8, 6, 4, 7, 9};
        assertThat(crossTheRiver(X, A)).isEqualTo(10);
    }
    
    @Test
    public void crossTheRiver_return2() {
        int X = 3;
        int[] A = {1, 3, 2};
        assertThat(crossTheRiver(X, A)).isEqualTo(2);
    }
    
    @Test
    public void crossTheRiver_arrayWithTheSameValuesThanDistanceX_returnNegative1() {
        int X = 2;
        int[] A = {2, 2, 2, 2};
        assertThat(crossTheRiver(X, A)).isEqualTo(-1);
    }

}
