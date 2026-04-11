class Solution {
    public void rotate(int[][] matrix) {
        int row =matrix.length;
        int col =matrix[0].length;
      // transpose
        for(int i=1;i<row;i++){
            for(int j =0;j<i;j++){
                int temp =matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] =temp;
            }
        }
       // print reverse
       for(int i =0;i<row;i++){
        int start =0, end =col-1;
             while(start<end){
                int temp =matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
             }
        
    }
}
}