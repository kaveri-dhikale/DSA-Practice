import java.util.*;
class Solution{
    public  int minimum(int n){
        int smallest = Integer.MAX_VALUE;
        while(n != 0){
            int num = n % 10;
            if(smallest > num){
                smallest = num;
            }
            n = n /10;
        }
        return smallest;
    }
    public  int maximum(int n){
        int largest = Integer.MIN_VALUE;
        while( n!=0){
            int num = n % 10;
            if(num >largest){
                largest = num;
            }
            n = n/10;
        }
        return largest;
    }
}
public class Find_Key {
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z =  sc.nextInt();

        Solution obj = new Solution();
        int minimumSum = obj.minimum(x) + obj.minimum(y) + obj.minimum(z);
        int maximunSum  =  obj.maximum(x)+obj.maximum(y)+ obj.maximum(z);

        int key = minimumSum-maximunSum;
        System.out.println("Key : "+key);
    }
    
}
   
