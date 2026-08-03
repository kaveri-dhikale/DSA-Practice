import java.util.*;
public class Valid_Perfect_Square {
    public static boolean isValidSquare(int num){
        int low = 1;
        int high = num;

        while(low <= high){
            int mid = (low+high)/2;

            long midSquare = mid * mid;
            if(midSquare == num){
                return true;
            }
            else if(midSquare < num){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidSquare(16));
    }
}
