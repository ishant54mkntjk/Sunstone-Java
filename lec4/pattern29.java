package lec4;

public class pattern29 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        
        while(row<=n){
            // space
            int i =1;
            while(i <=space){
                System.out.print(" \t");
                i++;
            }

            // Star
            int j=1;
            int val= row;
            while(j<=star){
                if(j ==1 || j == star){
                 System.out.print(val+"\t");
                }
                else{
                    System.out.print("0\t");
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
