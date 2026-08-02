import java.util.*;
public class First_letter_To_Appear_twice {
    public static char repeatedCharacter(String s){
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                return ch;
            }
        }
        return 'a';
    }
    public static void main(String args[]){
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
}
