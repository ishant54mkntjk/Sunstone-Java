import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
         int m =sc.nextInt();
        int n=sc.nextInt();

        int[][] arr =new int[m][n];
        // input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        // output
        for(int i=0;i<m;i++){
            if(m%2 == 0){
            for(int j=0;j<n;j++){
              System.out.print(arr[i][j]+" ");
            }
            }

            else if(m%2 !=0) {
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
