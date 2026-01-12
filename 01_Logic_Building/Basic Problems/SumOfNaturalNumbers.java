// Problem Statement:-
// Given a positive integer n, find the sum of the first n natural numbers.
// Examples : 
// Input: n = 3
// Output: 6
// Explanation: 1 + 2 + 3 = 6

// Input: n = 5
// Output: 15 
// Explanation:  1 + 2 + 3 + 4 + 5 = 15

public class SumOfNaturalNumbers {
    public static int sumNaturalNumbers(int terms){
        return (terms * (terms + 1)) / 2;
    }
    public static void main(String[] args) {
        System.out.println(sumNaturalNumbers(5));
    }
}
