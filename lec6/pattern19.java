package lec6;

public class pattern19 {
    public static void main(String[] args) {
        int n = 7;
        int row =1;
        int space = n-3;
        int star =1;

        while(row <=n){
            // Space
            int i =1;
            while(i <=space){
            System.out.print(" * ");
            i++;
            }
            // Star
            int j =1;
            while(j <= star){
                System.out.print("  ");
                j++;
            }

            if(row <n-3){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            row++;
            System.out.println();
        }
    }
    
}
