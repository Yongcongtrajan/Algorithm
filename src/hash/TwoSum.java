package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSumBrutalForce(int[] array, int target) {
        if ( array == null || array.length < 2 ) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (target == array[i] + array[j]) {
                    return new int[]{i, j};
                }

            }

        }

        return new int[]{-1, -1};

    }

    private static int[] twoSumHashSet(int[] array, int target) {
        if (array == null || array.length < 2) {
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> twoSumHashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (twoSumHashMap.get(target - array[i]) != null) {
                return new int[]{twoSumHashMap.get(target - array[i]), i};

            } else {
                twoSumHashMap.put(array[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumBrutalForce(new int[]{2, 7, 11, 15}, 22)));
        System.out.println(Arrays.toString(twoSumHashSet(new int[]{11,15,7,2}, 22)));
    }
}
