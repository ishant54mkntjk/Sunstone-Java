package lec4;

public class pattern8 {
    public static void main(String[] args) {
        int row = 1;
        int n = 5;
        int star = n;

        while (row <=n) {
            // Star 
            int i = 1;
            while(i <= star){
                if (row == i || row+i-1 == n  ){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                i++;
                
            }
        row++; 
        System.out.println(); 
        }
        
    }
    
}
