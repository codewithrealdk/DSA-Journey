// Problem Statement:-
// Given a positive integer n, we have to find the sum of squares of first n natural numbers. 
// Examples : 
// Input : n = 2
// Output: 5
// Explanation: 1^2+2^2 = 5

// Input : n = 8
// Output: 204
// Explanation :  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 = 204 

public class SumOfSquaresOfNaturalNumbers {
    public static int  sumOfSquaresOfNaturalNumbers(int terms){
        int sum = 0;
        for(int i = 1; i <= terms; i++){
            sum += i * i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumOfSquaresOfNaturalNumbers(8));
    }
}
