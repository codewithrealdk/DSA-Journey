// Program to find LCM of two numbers
// Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
// LCM of two numbers is the smallest number which can be divided by both numbers. 

// Input :  a = 10, b = 5
// Output :  10
// Explanation : 10 is the smallest number divisible by both 10 and 5

// Input :  a = 5, b = 11
// Output :  55
// Explanation : 55 is the smallest number divisible by both 5 and 11


//Solving using the Brute-force method
// public class Lcm {
//     public static int lcmFinder(int a , int b){
//         int u = Math.max(a , b);
//         int v = Math.min(a , b);

//         for(int i = u ; i <= a * b; i += u){
//             if(i % v == 0){
//                 return i;
//             }
//         }
//         return a * b;
//     }
//     public static void main(String[] args) {
//         System.out.println(lcmFinder(55, 11));
//         System.out.println(lcmFinder(10, 5));
//     }
// }

//Solving in optimized way using Eucledian method

public class Lcm {
    public static int gcd(int a , int b){
        return (b == 0) ? a : gcd(b , a % b);
    }

    public static int lcmFinder(int a , int b){
        return (a * b)/gcd(a , b);
    }
    public static void main(String[] args) {
        System.out.println(lcmFinder(55, 11));
        System.out.println(lcmFinder(10, 5));
    }
}