package binarysearchandrecursion;

public class CloestInSortedArray {
    public static void main(String[] args) {
        CloestInSortedArray cloestInSortedArray = new CloestInSortedArray();
        if (cloestInSortedArray.closest(new int[]{1, 2, 3}, 2) == 1) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed ");
        }
        if (cloestInSortedArray.closest(new int[]{1, 4, 6}, 3) == 1) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        if (cloestInSortedArray.closest(new int[]{1, 4, 6}, 5) == 1 ||
                cloestInSortedArray.closest(new int[]{1, 4, 6}, 5) == 2) {
            System.out.println("Passed");
        } else {
            System.out.println("FAiled");
        }
        if (cloestInSortedArray.closest(new int[]{1, 3, 3,4}, 2) == 1 ||
                cloestInSortedArray.closest(new int[]{1, 3, 3,4}, 2) == 0 ||
                cloestInSortedArray.closest(new int[]{1, 3, 3,4}, 2) == 2 ) {
            System.out.println("Passed");
        } else {
            System.out.println("FAiled");
        }

    }

    private int closest(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
            return left;

        }
        return right;

    }
}
