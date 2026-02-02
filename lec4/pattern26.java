package lec4;

public class pattern26 {
    public static void main(String[] args) {
        int n= 5;
        int row =1;
        
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
            int var =1;
            while(j <= star){
                System.out.print(var+"\t");
                j++;
                var++;
            }

            row++;
            star+=2;
            space--;
            
            System.out.println();
        }

    }
    
}
