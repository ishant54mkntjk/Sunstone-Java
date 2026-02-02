package lec4;

public class pattern14 {
    public static void main(String[] args){
        int n= 5;
        int row = 1;
        int star = 1;
        int space = n-1;

        while(row <= n*2-1){
            // Space 
        int i =1;
        while(i <= space){
            System.out.print("  ");
            i++;
        }
         // Star
         int j = 1;
         while(j <= star){
            System.out.print("* ");
            j++;
         }
         
         if(row<n){
            space--; 
            star++;  
         }
         else{
            space++; 
            star--;  
         }
         row++;
         System.out.println();
        }
    }
    
}
