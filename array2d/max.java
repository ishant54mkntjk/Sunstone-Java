package array2d;

public class max {
    public static void main(String[] args){
        // int[][] arr =new int[3][4];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int max =arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              if(arr[i][j]>max){
                max =arr[i][j];
              }
                
            }
           
        }
          System.out.println(max);
 }
}
