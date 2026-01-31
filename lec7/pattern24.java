package lec7;

public class pattern24 {
    public static void main(String[] args) {
        int n= 5;
        int row =1;
        int var =1;
        int space =n-1;
        int star =1;
         
        while(row <=n){
            // Space
            int i=1;
            while (i <= space){
                System.out.print(" \t");
                i++;
            }
            // Star
            int j=1;
            
            while(j <= star){
                System.out.print(var+"\t");
                j++;
            }

            row++;
            star+=2;
            space--;
            var++;
            System.out.println();
        }

    }
    
}
