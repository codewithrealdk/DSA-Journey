// Remove duplicates from Sorted Array
// Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

// Note: The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

// Examples: 

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: All the elements are 2, So only keep one instance of 2.

// Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
// Output: [1, 2, 3, 4, 5]

// Input: arr[] = [1, 2, 3]
// Output: [1, 2, 3]
// Explanation : No change as all elements are distinct.

import java.util.ArrayList;

public class Duplicates {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        int id = 1;
        result.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[id++] = arr[i];
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Duplicates d = new Duplicates();
        int[] arr = {2,2,5,6,6,9,9,1};
        System.out.println(d.removeDuplicates(arr));
    }
}
