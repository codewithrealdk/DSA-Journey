// Problem Statement:-
// Write a program to reverse digits of a number
// Given an Integer n, find the reverse of its digits.
// Examples:  
// Input: n = 122
// Output: 221
// Explanation: By reversing the digits of number, number will change into 221.

// Input: n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.

// Input: n = 12345 
// Output: 54321
// Explanation: By reversing the digits of number, number will change into 54321.

public class ReverseDigits {
    public static int reverseDigits(int number){
        int rev = 0;
        while(number != 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverseDigits(54321));
    }
}
