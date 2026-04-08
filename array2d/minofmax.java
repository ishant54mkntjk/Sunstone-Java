package array2d;

public class minofmax {
    public static void main(String[] args){
        // int[][] arr =new int[3][4];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int maxx =Integer.MIN_VALUE;
        int minn =Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
             int max=arr[0][0];
            for(int j=0;j<3;j++){
              if(arr[i][j]>max){
                max =arr[i][j];
              }
            }
              minn =Math.min(minn,max); 
            } 
           System.out.println(minn);
        }
          
 }

