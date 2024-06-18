package com.j2esus.epam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Houses {
    public static int solution(int K, int[][] A) {
        int countGoodSpot = 0;
        int countGoodResultsPerHouse;
        List<int[]> houses = new ArrayList<>();

        for(int x = 0; x < A.length; x++) {
            for(int y = 0; y < A[x].length; y++) {
                if(A[x][y] == 1) {
                    houses.add(new int[]{x, y});
                }
            }
        }

        for(int x = 0; x < A.length; x++) {
            for(int y = 0; y < A[x].length; y++) {
                if (A[x][y] == 1) {
                    continue;
                }
                countGoodResultsPerHouse = 0;
                Iterator<int[]> iterator = houses.iterator();
                boolean breakHouses = false;
                while(iterator.hasNext() && !breakHouses) {
                    int[] indexes = iterator.next();
                    int result = Math.abs(x - indexes[0]) + Math.abs(y - indexes[1]);
                    if(result > K) {
                        breakHouses = true;
                    } else {
                        countGoodResultsPerHouse++;
                    }
                }
                if( countGoodResultsPerHouse == houses.size()) {
                    countGoodSpot++;
                }
            }
        }

        return countGoodSpot;
    }
}
