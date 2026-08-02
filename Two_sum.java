import java.util.*;
public class Two_sum {
    public static int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);

        int i=0; 
        int j= nums.length-1;

        while(i < j){
            if(nums[i] + nums[j] == target){
                return new int[] {i,j};
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
