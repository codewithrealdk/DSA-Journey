// Program to Find GCD or HCF of Two Numbers
// Given two positive integers a and b, the task is to find the GCD of the two numbers.
// Note: The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them. 
// gcd
// Examples:
// Input: a = 20, b = 28
// Output: 4
// Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.

// Input: a = 60, b = 36
// Output: 12
// Explanation: GCD of  60 and 36 is 12.


//Loop method to find the hcf or gcd


// public class GcdOrHcf {
//     public static int hcfFinder(int a , int b){
//         int hcf = 1;
//         for(int i = 1; i <= Math.min(a , b); i++){
//             if(a % i == 0 && b % i ==0){
//                 hcf = i;
//             }
//         }
//         return hcf;
//     }
//     public static void main(String[] args){
//         System.out.println(hcfFinder(10,20));
//         System.out.println(hcfFinder(60,36));
//     }
// }

//Eucledian method to find the hcf or gcd


public class GcdOrHcf {
    public static int hcfFinder(int a , int b){
        return (b == 0) ? a : hcfFinder(b, a % b);
    }
    public static void main(String[] args){
        System.out.println(hcfFinder(10,20));
        System.out.println(hcfFinder(60,36));
    }
}
