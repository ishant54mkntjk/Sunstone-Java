import java.util.*;
public class turnarray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();
          
        //create array
        int[][] arr =new int[row][col];

        // input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        // output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
      sc.close();
    }
}
