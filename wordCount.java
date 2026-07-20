import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            int count = 0;
            boolean inWord = false;
            for(int i=0; i<line.length(); i++){
                char ch = line.charAt(i);
                if(Character.isLetter(ch)){
                    if(!inWord){
                        count++;
                        inWord = true;
                    }else{
                        inWord = false;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
