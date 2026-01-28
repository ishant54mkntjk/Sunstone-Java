package lec6;

public class pattern27 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;    
        int space = n-1;
        int star =1;

        while(row<=n){
            
            // space
            int i =1;
            while(i<=space){
                System.out.print(" \t");
                i++;
            }
            // star
            int j =1;
            int val =1;
            while(j<=star){
                System.out.print(val+"\t");

                if(j <row){
                    val++;
                }
                else{
                    val--;
                }
                j++;
            }
            row++;
            space--;
            star+=2;
            System.out.println();
            
        }
    }
    
}
