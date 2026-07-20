import java.util.*;
public class unique_paths {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = 0;
            }
        }
        for(int i=0; i<col; i++){
            matrix[0][i] = 1;
        }
        for(int i=0; i<row; i++){
            matrix[i][0] = 1;
        }
        for(int i=1; i<row;i++){
            for(int j=1; j<col; j++){
                matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
            }
        }
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
