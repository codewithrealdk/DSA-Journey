// Problem Statemetn:-
// Given two numbers a and b, the task is to swap them.
// Examples:

// Input: a = 2, b = 3
// Output: a = 3, b = 2

// Input: a = 20, b = 0
// Output: a = 0, b = 20

// Input: a = 10, b = 10
// Output: a = 10, b = 10 

public class SwapTwoNumbers {
    public static int[] swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a , b};
    }
    public static void main(String[] args){
        int[] result = swapNumbers(10, 20);
        System.out.println(result[0] + " " + result[1]);
    }
}
