package lec4;

public class pattern19 {
    public static void main(String[] args) {
        int n =7;
        int row =1;
        int star =n/2+1;
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
                if( row ==1 && k==star || row ==n && k==star){
                    System.out.print("");
                }
                else{
                    System.out.print("* ");
                }
                k++;
              }

              if(row <n/2+1){
                 star--;
                 space+=2;
              }
              else{
                 star++;
                 space-=2;
              }
          
           row++;
           System.out.println();
        }   
    }  
}