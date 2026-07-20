import java.util.*;
public class mother_bear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();
            if(str.equals("DONE")){
                break;
            }
            str = str.replaceAll("[^A-Za-z]", "").toLowerCase();
            boolean palindrome  = true;
            int left = 0;
            int right = str.length();
            while(left < right){
                if(str.charAt(left) != str.charAt(right)){
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(palindrome){
                System.out.println("You wont be eaten");
            }else{
                System.out.println("Uh oh...");
            }

        }
    }
}
