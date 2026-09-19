//Fibonacci Numbers:

/*public class DP1 {
    //Memoization
    public static int fib1(int n, int dp[]) { //O(n)
        if(n == 0 || n == 1) {
            return n;
        }
        if(dp[n] != 0) { //fib(n) is already calculated
            return dp[n];
        }
        dp[n] = fib1(n-1, dp) + fib1(n-2, dp);
        return dp[n];
    }

    //Tabulation
    public static int fib2(int n) { //O(n)
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n]; //ans
    } 

    public static void main(String args[]) {
        int n = 5;
        int dp[] = new int[n+1]; //0, 0, 0, 0
        //System.out.println(fib1(n, dp));
        System.out.println(fib2(n));
    }
}*/
 
//Climbing Stairs(Brute Force): //T.C.: O(2^n)

/*public class DP1 {
    public static int countWays(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(countWays(n));
    }
}*/

//Climbing Stairs(Memoization): T.C : O(n)

/*import java.util.Arrays;

public class DP1 {
    public static int countWays(int n, int ways[]) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        if(ways[n] != -1) { //already calculated
            return ways[n];
        }

        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));
    }
}*/

//Climbing Stairs(Tabulation): T.C : O(n)

/*import java.util.*;

public class DP1 {
    public static int countWaysTab(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        //tabulation loop
        for(int i=1; i<=n; i++) {
            if(i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int ways[] = new int[n+1];
        System.out.println(countWaysTab(n));
    }
}*/

