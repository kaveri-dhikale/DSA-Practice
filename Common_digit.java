import java.util.*;
public class Common_digit {
    public static int commonDigit(int a, int b,int c){
        int[] freq = new int[10];
        while(a != 0){
            int num1 = a %10;
            freq[num1]++;
            a = a/10;
        }
         while(b != 0){
            int num2 = b %10;
            freq[num2]++;
            b = b/10;
        }
         while(c != 0){
            int num3 = c %10;
            
            freq[num3]++;
            c = c/10;
        }
        for(int i=0; i<freq.length;i++){
            if(freq[i] == 3){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(commonDigit(a, b, c));
    } 
}
