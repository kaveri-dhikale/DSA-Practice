//Day 2 ,  Date : 02/07/2026

import java.util.*;

public class Day_2_task{

    // 1. ************* Kadanes Algorithm **********

    public static void kadanes(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i < nums.length ; i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("The max subarray sum is  : " + maxSum);
    }

    //2.  ********************** sort 0's , 1's and 2's *************

    public static void sorting(int[] numbers){
        int n = numbers.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(numbers[mid] == 0){
                int temp = numbers[low];
                numbers[low] = numbers[mid];
                numbers[mid] = temp;
                mid++;
                low++;
            }
            else if(numbers[mid] == 1){
                mid++;
            }
            else{
                int temp1 = numbers[mid];
                numbers[mid] = numbers[high];
                numbers[high] = temp1;
                high--;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }

    //3. ********************** Buy and Sell Stocks *************

    public static int buyAndSellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        //1. ************* Kadanes Algorithm **********

         int[] nums = {-2, -3, 4 ,-1, -2, 1, 5, -3};
         kadanes(nums);

         //2. ********************** sort 0's , 1's and 2's *************

         int[] numbers = {2,0,2,1,1,0,1,2,0,0};
         sorting(numbers);

         //3. ********************** Buy and Sell Stocks *************

         int[] prices = {7,1,5,3,6,4};
         System.out.println(buyAndSellStocks(prices));
    }
}