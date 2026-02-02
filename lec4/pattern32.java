package lec4;

public class pattern32 {
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=1;
        int var=1;
        
        while(row<=n*2-1){

            // Star
            int j=1;
            
            while(j<=star){
                if(j == 1){
                    System.out.print("");
                }
                else{
                    System.out.print("*\t");
                 
                }
                System.out.print(var+"\t");
                j++;
                             
            }
              if(row<n){
                var++;
                star++;
              }
              else{
                var--;
                star--;
              }
             
            row++;         
            
            
                    
            System.out.println();
        }

    }
    
}
