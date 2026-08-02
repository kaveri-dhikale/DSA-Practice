import java.util.*;
class Solution{
    public int[] twoSum(int[] nums, int target){
        int i = 0 ;
        int j = nums.length-1 ;
        while(i < j){
            if(nums[i] + nums[j] == target){
                return new int[] {i+1,j+1};
            }
            if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[] {-1,-1};
    }
}
public class Two_Sum_II_sorted {
    
    public static void main(String args[]){
        Solution obj = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
}
