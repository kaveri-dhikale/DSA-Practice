import java.util.*;
public class jolly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            if(n ==1){
                System.out.println("jolly");
            }
            boolean[] visited = new boolean[n];
            boolean jolly = true;
            for(int i=0; i<n; i++){
                int diff = Math.abs(arr[i] - arr[i-1]);
                if(diff >= 1 && diff <= n-1 && !visited[diff]){
                    visited[diff] = true;;
                }else{
                    jolly = false;
                    break;
                }
            }
            if(jolly){
                System.out.println("jolly");
            }else{
                System.out.println("not jolly");
            }
        }
    }
}
