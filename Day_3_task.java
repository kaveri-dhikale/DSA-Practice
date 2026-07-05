import java.util.*;

public class Day_3_task {

     //************** Rotate matrix by 90 degrees ***********/

    public static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     //************** Merge 2 sorted Arrays ***********/

     public static void merge(int[] nums1, int m, int[] nums2, int n1){
        int i = m - 1;
        int j = n1 - 1;
        int k = m + n1 -1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while( j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.print(Arrays.toString(nums1));
     }
    public static void main(String args[]){
        //************** Rotate matrix by 90 degrees ***********/
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix size : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //transpose
        for(int i=0; i<arr.length; i++){
            for(int j=i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i<arr.length; i++){
            int li = 0;
            int ri = arr.length-1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }

        }

        printMatrix(arr);
    

        //************** Merge 2 sorted Arrays ***********/

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n1 = 3;
        merge(nums1, m, nums2, n);
    }
}
