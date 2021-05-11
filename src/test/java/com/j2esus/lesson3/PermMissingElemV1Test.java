package com.j2esus.lesson3;

import static com.google.common.truth.Truth.assertThat;
import static com.j2esus.lesson3.PermMissingElemV1.findMissingElement;
import org.junit.Test;

public class PermMissingElemV1Test {
    
    @Test
    public void findMissingElement_return3(){
        int[] array = new int[]{1, 2, 4, 5};
        assertThat(findMissingElement(array)).isEqualTo(3);
    }
    
    @Test
    public void findMissingElement_return13() {
        int[] array = new int[]{2, 1, 3, 4, 5, 8, 9, 10, 11, 7, 15, 14, 12, 6};
        assertThat(findMissingElement(array)).isEqualTo(13);
    }
    
    @Test
    public void findMissingElement_return21() {
        int[] array = new int[]{17, 2, 18, 1, 19, 3, 4, 5, 8, 9, 13 ,10, 11, 7, 15, 14, 12, 
            6, 16, 20};
        assertThat(findMissingElement(array)).isEqualTo(21);
    }
    
    @Test
    public void findMissingElement_emptyArray_return1() {
        int[] array = new int[]{};
        assertThat(findMissingElement(array)).isEqualTo(1);
    }
    
    @Test
    public void findMissingElement_return1() {
        int[] array = new int[]{17, 2, 18, 21, 19, 3, 4, 5, 8, 9, 13, 10, 11, 7, 15, 14, 12,
            6, 16, 20};
        assertThat(findMissingElement(array)).isEqualTo(1);
    }
}
