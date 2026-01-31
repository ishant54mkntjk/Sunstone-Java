package lec7;

public class pattern30 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=n;
        
        
        while(row<=n){

            // Star
            int j=1;
            int var=5;
            while(j<=star){
               
                 System.out.print(var+"\t");
                
                j++;
                var--;
                
            }
            row++;         
            
            System.out.println();
        }

    }
    
}
