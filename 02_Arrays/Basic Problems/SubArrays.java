// Generating All Subarrays
// Given an array arr[], the task is to generate all the possible subarrays of the given array.

// Examples: 

// Input: arr[] = [1, 2, 3]
// Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]

// Input: arr[] = [1, 2]
// Output: [ [1], [1, 2], [2] ]

import java.util.ArrayList;
import java.util.List;

public class SubArrays {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                List<Integer> subArray = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    subArray.add(arr[k]);
                }
                result.add(subArray);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        SubArrays sa = new SubArrays();
        List<List<Integer>> subArrays = sa.getSubArrays(arr);
        System.out.println("All Non-empty Subarrays:");
        for(List<Integer> sub : subArrays) {
        System.out.println(sub);
        }
    }
}
