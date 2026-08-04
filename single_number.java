import java.util.*;
public class single_number {
    public static int singlNumber(int[] nums){
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singlNumber(nums));
    }
}
