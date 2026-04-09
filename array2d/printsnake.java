package array2d;

public class printsnake {
    public static void main(String[] args){
        // int[][] arr =new int[3][4];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            }

            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
             System.out.println();
        }
       
    }
}