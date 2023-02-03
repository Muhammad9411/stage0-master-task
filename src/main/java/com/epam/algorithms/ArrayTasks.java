package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                arr[i] = i + 1;
            }
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int summary = 0;
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        return summary;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int arr_ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                arr_ind = i;
                break;
            } else {
                arr_ind = -1;
            }
        }
        return arr_ind;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] new_arr = new String[arr.length];
        int arr_ind_cnt = arr.length - 1;

        for (int i = arr_ind_cnt; i >= 0; i--) {
            new_arr[arr_ind_cnt - i] = arr[i];
        }

        return new_arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int[] new_arr = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                new_arr[k] = arr[i];
                k++;
            }
        }

        int[] new_arr_copy = new int[k];

        for (int i = 0; i < k; i++) {
            new_arr_copy[i] = new_arr[i];
        }

        return new_arr_copy;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int temp;
                for (int i = 0; i < arr[row].length; i++) {
                    if (arr[row][col] < arr[row][i]) {
                        temp = arr[row][i];
                        arr[row][i] = arr[row][col];
                        arr[row][col] = temp;
                    }
                }
            }
        }

        for (int row = 0; row < arr.length; row++) {

            int[] temp;
            for (int j = 0; j < row; j++) {

                if (arr[row].length < arr[j].length) {
                    temp = arr[j];
                    arr[j] = arr[row];
                    arr[row] = temp;
                }
            }
        }

        return arr;
    }

}
