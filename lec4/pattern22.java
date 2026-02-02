package lec4;

public class pattern22 {
    public static void main(String[] args) {
        int n =5;
        int row =1;
        int star =n;
        int space =-1;
        

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
            int k =1;
            while(k <= star){
                if( row ==1 && k==5){
                    System.out.print("");
                }
                else{
                    System.out.print("* ");
                }
                k++;
            }

           
           row++;
           star--;
           space+=2;

           System.out.println();
        }
        
    }
    

}