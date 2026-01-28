// Pair Cube Count
// Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs
// Examples: 

// Input: n = 9
// Output: 2
// Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9

// Input: n = 28
// Output: 2
// Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28

public class PairCube {
    public static int pairCubeCounter(int n){
        int count = 0;
        int limit = (int) Math.cbrt(n);
        for(int a = 1; a <= limit; a++){
            int aCube = a * a * a;
            for(int b = 1; b <= limit; b++){
            int bCube = b * b * b;
            if(aCube + bCube == n){
                count ++;
            }
        }
    }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(pairCubeCounter(9));
        System.out.println(pairCubeCounter(28));
        System.out.println(pairCubeCounter(56));
        System.out.println(pairCubeCounter(4));
    }
}
