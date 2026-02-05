// Leaders in an array
// Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.

// Note: The rightmost element is always a leader.

// Examples:

// Input: arr[] = [16, 17, 4, 3, 5, 2]
// Output: [17 5 2]
// Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.

// Input: arr[] = [1, 2, 3, 4, 5, 2]
// Output: [5 2]
// Explanation: 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.

public class Leaders {
    public void leaderArray(int[] arr){
        int n = arr.length;
        int alwaysALeader = arr[n - 1];
        int[] leaders= new int[n];
        int size = 0;
        leaders[size] =  alwaysALeader;
        size++;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] >= alwaysALeader){
                alwaysALeader = arr[i];
                leaders[size] = arr [i];
                size++;
            }
        }
        System.out.println("Leaders in array:");
        for(int i = size - 1; i >= 0; i--){
            System.out.print(leaders[i] + " ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
         int[] arr = {1,5,99,5,6,44,23};
         Leaders l = new Leaders();
         l.leaderArray(arr);
     }
}
