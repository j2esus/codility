package com.j2esus.lesson4;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson4.MissingIntegerV2.solution;
import org.junit.Test;

public class MissingIntegerV2Test {
    
    @Test
    public void solution_negativeValues_return1(){
        int[] A = {-1, -3};
        assertThat(solution(A)).isEqualTo(1);
    }

    @Test
    public void solution_correctSequence_return4(){
        int[] A = {1, 2, 3};
        assertThat(solution(A)).isEqualTo(4);
    }

    @Test
    public void solution_equalNegativeAndPositiveValues_return2(){
        int[] A = {-1,-3, 1, 3};
        assertThat(solution(A)).isEqualTo(2);
    }

    @Test
    public void solution_oneRepeatedValue_return5(){
        int[] A = {1, 3, 6, 4, 1, 2};
        assertThat(solution(A)).isEqualTo(5);
    }
    
    @Test
    public void solution_missinValueInPermutation_return4(){
        int[] A = {1, 3, 5, 6, 2, 7};
        assertThat(solution(A)).isEqualTo(4);
    }

    @Test
    public void solution_return1(){
        int[] A = {4, 5, 6, 2};
        assertThat(solution(A)).isEqualTo(1);
    }
}
