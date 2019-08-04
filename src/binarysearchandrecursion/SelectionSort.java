package binarysearchandrecursion;

public class SelectionSort {
    public int[] solve(int[] array) {
        //check null before any other things
        if (array == null || array.length <= 1) {
            return array;

        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            //find the min element in the subarray of (i,arry.length-1)
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
