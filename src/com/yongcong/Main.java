package com.yongcong;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public class Solution {
        public int binarySearch(int[] array, int target) {
            if(array == null || array.length == 0 ) {
                return -1;
            }
            int left = 0;
            int right = array.length -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
            return -1;
            // Write your solution here
        }
    }

}
