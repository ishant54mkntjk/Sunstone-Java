package array2d;

public class foreachloop {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        // for(int[] ele: arr){
        //     for(int a : ele){
        //         System.out.print(a+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=0;i<arr.length;i++){
            for(int a : arr[i]){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
