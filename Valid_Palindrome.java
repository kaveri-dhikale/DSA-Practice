import java.util.*;
public class Valid_Palindrome {
    public static boolean isValidPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(Character.isLetterOrDigit(left) != Character.isLetterOrDigit(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }
}
