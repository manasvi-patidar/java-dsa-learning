//Max Subarray Sum(Brute Force Approach): {TC: O(n^3)}

/*import java.util.*;

public class Arrays2 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
    }
}*/

//Max Subarray Sum(Prefix Array Approach): {TC: O(n^2)}

/*import java.util.*;

public class Arrays2 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3}; //sum of -2, 6, -1 is 8
        maxSubarraySum(numbers);
    }
}*/

//Max Subarray Sum(Optimised Approach): {TC: O(n)}
//Kadane's Algorithm:

/*import java.util.*;

public class Arrays2 {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;  //maximum sum
        int cs = 0;  //current sum

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1,-2, 1, 5, -3};
        kadanes(numbers);
    }
}*/

//Trapping Rainwater: {TC: O(n)}

/*import java.util.*;

public class Arrays2 {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        //Loop
        for(int i=0; i<n; i++) {

            //waterLevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    } 

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}*/

//Best Time to Buy and Sell Stocks: {TC: O(n)}

/*import java.util.*;

public class Arrays2 {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {  //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}*/



