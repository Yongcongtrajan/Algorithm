package antra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main (String [] args) {
        System.out.println(Arrays.toString(result(new int[]{2, 5, 8, 10}, 12)));
        System.out.println(Arrays.toString(result(new int[]{3,1,9,12,4,7},21)));
    }
    private static int [] result (int [] array, int target) {
        if(array == null || array.length < 2) {
            return new int[] {-1,-1};
        }
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < array.length ; i++) {
            if(!hashMap.containsKey(target - array[i])) {
                hashMap.put(array[i],i);
            } else {
                return new int[] {hashMap.get(target-array[i]),i};
            }
        }

        System.out.println("No Matching Found!");
        return new int[] {-1,-1};
    }
}
