package lec4;

public class pattern6 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;

        while(row <= n){

            // Space
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            // Star
            int j = 1;
            while(j <= star){
                System.out.print(" *");
                j++;
            }
            
            row++; 
            star--; 
            space+=2;
            System.out.println();
        }
    }
    
}
