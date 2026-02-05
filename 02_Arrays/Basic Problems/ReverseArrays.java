// Array Reverse
// Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

// Examples:

// Input: arr[] = [1, 4, 3, 2, 6, 5]  
// Output:  [5, 6, 2, 3, 4, 1]
// Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// Input: arr[] = [4, 5, 1, 2]
// Output: [2, 1, 5, 4]
// Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

public class ReverseArrays {
    public void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        ReverseArrays r = new ReverseArrays();
        r.reverseArray(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}