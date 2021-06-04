package com.j2esus.lesson4;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson4.MaxCountersV2.calculate;
import org.junit.Test;

public class MaxCountersV2Test {
    
    @Test
    public void calculate_arrayWithMayorElementInTheMiddle_correctArray() {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] expectedMaxCounters = {3, 2, 2, 4, 2};
        assertThat(calculate(5, A)).isEqualTo(expectedMaxCounters);
    }

    @Test
    public void calculate_arrayWithMajorElementAtTheEnd_arrayWithTheSameElement3() {
        int[] A = {2, 3, 4, 5, 2, 5, 5, 7};
        int[] expectedMaxCounters = {3, 3, 3, 3, 3, 3};
        assertThat(calculate(6, A)).isEqualTo(expectedMaxCounters);
    }

    @Test
    public void calculate_arrayWithMajorElementAtTheEnd_arrayWithTheSameElement4() {
        int[] A = {5, 4, 5, 5, 5, 4, 6};
        int[] expectedMaxCounters = {4, 4, 4, 4, 4};
        assertThat(calculate(5, A)).isEqualTo(expectedMaxCounters);
    }
    
    @Test
    public void calculate_arrayWithMajorElementAtTheBegining_arrayWithSameElement1() {
        int[] A = {4, 1, 3, 2};
        int[] expectedMaxCounters = {1, 1, 1};
        assertThat(calculate(3, A)).isEqualTo(expectedMaxCounters);
    }

    @Test
    public void calculate_arrayWithMajorElementAtTheBegining_correctArray() {
        int[] A = {4, 1, 3, 2, 2};
        int[] expectedMaxCounters = {1, 2, 1};
        assertThat(calculate(3, A)).isEqualTo(expectedMaxCounters);
    }
}
