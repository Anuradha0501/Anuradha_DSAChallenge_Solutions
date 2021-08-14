/*12.     Write a program to search an element in a 2-D array (matrix),
where the 2-D array must be sorted row-wise from left-to-right and first integer of
each row is greater than last integer of previous row. Ex: - input: matrix = [
[1, 3, 5, 7],
[10, 11, 16, 20],
[23, 30, 34, 50]
]; and target=16, output: True (False, if element not found).
*/

import java.util.*;
public class searchElementinMatrix {
    static final int row = 3;
    static final int col = 4;
    static boolean search(int arr[], int K){
        int low = 0;
        int high = col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == K) {
                return true;
            }
            if (arr[mid] < K) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    static boolean searchMatrix(int matrix[][], int K){
        int low = 0;
        int high = row - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (K >= matrix[mid][0]
                && K <= matrix[mid][col - 1]) {
                return search(matrix[mid], K);
            }
            if (K < matrix[mid][0]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = { { 1, 3, 5, 7 },
                           { 10, 11, 16, 20 },
                           { 23, 30, 34, 50 } };
        int K = 3;
        if (searchMatrix(matrix, K)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}