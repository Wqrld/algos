package net.wqrld;

import java.util.Arrays;

public class Main {

    public static int[] merge(int[] left, int[] right) {
        int[] newarr = new int[right.length + left.length]; // Make a new array that can fit the merged arrays

        int rightindex = 0;
        int leftindex = 0;
        int newindex = 0;

        while (true) {
            // Are all numbers checked? Return merged array
            if (rightindex >= right.length && leftindex >= left.length) {
                return newarr;
            }
            // Right array is fully added
            if (rightindex >= right.length) {
                newarr[newindex] = left[leftindex];
                newindex++;
                leftindex++;

            // Left array is fully added
            } else if (leftindex >= left.length) {
                newarr[newindex] = right[rightindex];
                newindex++;
                rightindex++;

            // Left <= right, add left
            } else if (left[leftindex] <= right[rightindex]) {//all items of right are used OR left <= right
                newarr[newindex] = left[leftindex];
                newindex++;
                leftindex++;

            // Right <= left, add right
            } else if (right[rightindex] <= left[leftindex]) { //all items of right are used OR right <= left
                newarr[newindex] = right[rightindex];
                newindex++;
                rightindex++;
            }

        }

    }

    public static int[] mergeSort(int[] array) {

        // Base case
        if (array.length <= 1) {
            return array;
        }

        // Split our array in two
        int[] left = Arrays.copyOfRange(array, 0, (int) Math.floor(array.length / 2));
        int[] right = Arrays.copyOfRange(array, (int) Math.floor(array.length / 2), array.length);

        // Recursively sort
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge our two sorted arrays
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] toSort = {-5, 2, 4, 6, 45, 67, 2, 3, 3, 4, 1, -100};

        int[] sorted = mergeSort(toSort);

        // Print our sorted numbers
        for (int i : sorted) {
            System.out.println(i);
        }

    }
}
