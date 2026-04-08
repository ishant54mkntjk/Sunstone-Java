package array2d;

public class maxrowsum {
    public static void main(String[] args){
        // int[][] arr =new int[3][4];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int maxSum =Integer.MIN_VALUE;
        int row =-1;
        for(int i=0;i<3;i++){
            int sum =0;
            for(int j=0;j<3;j++){
              sum +=arr[i][j];
              }
            //   maxSum =Math.max(maxSum,sum);
              if(sum>maxSum){
                maxSum =sum;
                row =i;
              }
            } 
           System.out.println(row +" "+maxSum);
        }
          
 }

