// Problem Statement:-
// Introduction to Primality Test and School Method
// Given a positive integer, check if the number is prime or not. A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Examples of the first few prime numbers are {2, 3, 5, ...}
// Examples : 
// Input:  n = 11
// Output: true

// Input:  n = 15
// Output: false

// Input:  n = 1
// Output: false 


//Basic methods that we think out
// public class Prime {
//     public static boolean isPrime(int number){
//         if(number <= 1) return false;

//         for(int i = 2; i < number; i++){
//             if(number % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args){
//         System.out.println(isPrime(10));
//     }
// }


//Better -Approach

public class PrimeChecker{
    public static boolean isPrime(int number){
        if(number <= 1 ) return false;

        for(int i = 2; i * i <= number; i++){
            if(number % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(1));
        System.out.println(isPrime(17));
        System.out.println(isPrime(9));
        System.out.println(isPrime(11));
    }
}