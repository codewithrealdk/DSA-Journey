// package 02_Arrays.BasicProblems;

// Alternate elements of an array
// Given an array arr[], the task is to print every alternate element of the array starting from the first element.

// Examples:

// Input: arr[] = [10, 20, 30, 40, 50]
// Output: 10 30 50
// Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).

// Input: arr[] = [-5, 1, 4, 2, 12]
// Output: -5 4 12

public class Alternates {
    public static void printAlternates(int[] arr){
        for(int i = 0; i < arr.length; i += 2){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int[] arr = {10, 20 , 30, 40, 50, 60};
        printAlternates(arr);

        int[] arr2 = {-5, 1, 4, 2, 12};
        printAlternates(arr2);
    }
}
