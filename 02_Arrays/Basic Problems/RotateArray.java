// Rotate an Array - Clockwise or Right
// Rotations in the array is defined as the process of rearranging the elements in an array by shifting each element to a new position. This is mostly done by rotating the elements of the array clockwise or counterclockwise.
// Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
// Output: {5, 6, 1, 2, 3, 4}
// Explanation: After first right rotation, arr[] becomes {6, 1, 2, 3, 4, 5} and after the second rotation, arr[] becomes {5, 6, 1, 2, 3, 4}

// Input: arr[] = {1, 2, 3}, d = 4
// Output: {3, 1, 2}
// Explanation: The array is rotated as follows:

// After first left rotation, arr[] = {3, 1, 2}
// After second left rotation, arr[] = {2, 3, 1}
// After third left rotation, arr[] = {1, 2, 3}
// After fourth left rotation, arr[] = {3, 1, 2}

public class RotateArray {
    public static void rotateArray(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];
        for(int i = 0; i < d; i++){
            temp[i] = arr [n - d + 1];
        }
        for(int i = 0; i < n - d; i++){
            temp[i + d] = arr [i];
        }
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateArray(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
