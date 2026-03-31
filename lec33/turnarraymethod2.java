public class turnarraymethod2 {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        int n =arr.length;
        //swap values
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] =temp;
            }
        }
       
        //output
        for(int[] row: arr){
            for(int var:row){
                System.out.print(var+" ");
            }
            //next line
            System.out.println();
        }
    }
}
