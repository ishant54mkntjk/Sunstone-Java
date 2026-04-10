package array2d;

public class printreverseofcol {
   public static void main(String[] args){
    int[][] arr ={{3,2,1},{6,5,4},{9,8,7}};
    
    for(int i=arr.length-1;i>=0;i--){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

   }
}