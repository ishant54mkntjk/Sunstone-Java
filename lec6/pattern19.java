package lec6;

public class pattern19 {
     public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int space = 1;
        int star = n-3;

        while(row <=n){
            
            // Star
            int i = 2;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // Space
            int j = 2;
            while (j <= space){
                System.out.print("  ");
                j++;
            }

            // Star
            int k = 2;
            while(k <= star){
                System.out.print("* ");
                k++;
             }

        // Next line
        if (row < n-3){
            space+=2;
            star--;
        }
        else {
            space-=2;
            star++;
        }
        row++;
        System.out.println();
    }
   
    
}
}
