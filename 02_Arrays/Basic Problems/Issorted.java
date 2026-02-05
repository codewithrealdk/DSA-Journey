// Check if an Array is Sorted
// Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.
// Examples: 
// Input: arr[] = [10, 20, 30, 40, 50]
// Output: true
// Explanation: The given array is sorted.

// Input: arr[] = [90, 80, 100, 70, 40, 30]
// Output: false
// Explanation: The given array is not sorted.

public class Issorted {
    public boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr [i+1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Issorted s = new Issorted();
        System.out.println(s.isSorted(arr));
    }
}
