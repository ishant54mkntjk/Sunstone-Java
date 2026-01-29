package lec8;

public class pat {
    public static void main(String[] args) {
         
        int n = 5;
        int row = 1;
        int star = n;
        int space =1;
        int star2 = 2;
        
        while(row <= n){
            // Star
            int i = 1;
            while(i <= star){
                if (row == 1 || row == n ){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                i++;
                
            }
        row++; 

        while(row>1 && row <5){
            // Star
            int l = 1;
            while(l <= star2){
                System.out.print("* ");
                l++;
            }
            // Space
            int j = 1;
            while (j <= space){
                System.out.print("  ");
                j++;
            }

            // Star
            int k = 1;
            while(k <= star2){
                System.out.print("* ");
                k++;
             }
        }
        System.out.println();
        }
    }
    
}
