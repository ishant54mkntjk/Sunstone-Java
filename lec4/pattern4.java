package lec4;

public class pattern4 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;

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
                System.out.print("* ");
                j++;
             }
             row++; star++; space--;
             System.out.println();
        }
    }
    
}
