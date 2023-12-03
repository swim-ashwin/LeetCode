/*
check if n is equal to 1 or 2. If true, return the value (1 or 2)

Otherwise, recursively call the climbStairs() function with n - 1 as an argument and n - 2 as an argument

Return the sum of the results of the two recursive calls
*/




public class staris {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
