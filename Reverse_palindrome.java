import java.util.*;
public class Reverse_palindrome {
    public static int reversePalindrome(int n){
        int reverse = 0;
        while(n > 0){
            int num = n %10;
            reverse = reverse*10+num;
            n = n /10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while(true){
            reverse = reversePalindrome(n);
            if(reverse == n){
                System.out.println(reverse);
                break;
            }
            else{
                int add = reverse + n;
                n = add;
            }
        }
    }
}
