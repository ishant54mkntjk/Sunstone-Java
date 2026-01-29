package lec7;

public class pattern21 {
    public static void main(String[] args) {
        int n =5;
        int row =1;
        int star =1;
        int star2 = 1;
        int space = n*2-3;

        while(row <= n){
            // Star
            int i =1;
            while(i <= star){
                System.out.print("* ");
                 i++;
            }
            // Space
            int j =1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }

            // Star
            int k = 1;
            while(k <= star2){
                if (row ==5 && k==5){
                System.out.print("");}
                else{
                    System.out.print("* ");
                }
                k++;
            }

           row++;
           star++;
           star2++;
           space-=2;
           System.out.println();
        }
        
    }
    
}
