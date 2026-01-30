package lec6;

public class patterndimond {
    public static void main(String[] args){
        int n=29;
        int row =1;
        int star =n;
        int space =1;
        int star2 =n/2;
        
        while(row<=n){
            // star 
            int i =1;
            while(i <=star){
                if(row ==1 || row ==n){
                   System.out.print("* ");
                }
                else{
                    
                }
                i++;
            }

                if(row>1 && row<n){
                      
            // star
            int j=1;
            while(j <= star2){
                System.out.print("* ");
                j++;
            }
            // Space
            int k= 1;
            while(k <=space){
                System.out.print("  ");
                k++;
            }
            // star2
            int l=1;
            while(l <= star2){
                System.out.print("* ");
                l++;
            }

            if (row <n/2+1){
                
                star2--;
                space+=2;
            }
            else{
                
                star2++;
                space-=2;
            }

          }
               
               
            row++;
            System.out.println();
        
    }
    
  }
}
