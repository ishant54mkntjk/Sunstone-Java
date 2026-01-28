package lec4;

public class pattern3 {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int star = 5;
        
        while(row <= n){
            // Star
            int i = 1;
            while(i <= star){
                System.out.print(" * ");
                i++;
            }
            row++; star--;
            System.out.println();
        }
    }
    
}

