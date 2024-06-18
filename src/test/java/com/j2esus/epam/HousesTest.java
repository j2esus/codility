package com.j2esus.epam;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HousesTest {

    @Test
    public void matrix2x2_oneHouse_twoSpots() {
        int[][] houses = {{0,1}, {0,0}};
        int requiredDistance = 1;

        int result = Houses.solution(requiredDistance, houses);
        assertEquals(2, result);
    }

    @Test
    public void matrix3x4_threeHouses_twoSpots() {
        int[][] houses = {{0, 0, 0, 0},
                          {0, 0, 1, 0},
                          {1, 0, 0, 1}};
        int requiredDistance = 2;

        int result = Houses.solution(requiredDistance, houses);
        assertEquals(2, result);
    }
}
