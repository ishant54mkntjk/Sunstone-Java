package lec5;

public class pattern11 {
    public static void main(String[] args) {
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
            while(j <=star){
                System.out.print(" *");
                j++;
            }
            row++;
            star+=2;
            space--;
            System.out.println();
        }


    }
    
}
