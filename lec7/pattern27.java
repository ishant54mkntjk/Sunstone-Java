package lec7;

public class pattern27 {
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
            int var= 1;
            while(j<=star){
                 System.out.print(var+"\t");
                if(j<row)
                    {var++;
                }
                else{var--;}
               
                j++;
                
                
            }

            row++;
            space--;
            
            star+=2;
            System.out.println();
        }

    }
    
}
