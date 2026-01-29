package lec7;

public class pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int row =1;     
        int star =1;
        int space =3;
        int space2 =-1;
        

        while(row <= n){
            // Space
            int i =1;
            while(i <= space){
                System.out.print("  ");
           i++;
           }       

           // Star
           int j =1;
           while(j <= star){
            System.out.print("* ");
            j++;
           }
             
           //Space
           int k=1; 
           while(k <=space2){
            if(row == 1 || row == n){
            System.out.print("");}
            else {
                System.out.print("  ");
            }
            
            k++;
           }
            // Star
           int l =1;
           while(l <= star){
            if(row == 1 || row ==n){
            System.out.print("");}
            else {
                System.out.print("* ");
            }
            l++;
           }


           if(row <n-3){
            space--;
            space2+=2;
           }
           else{
            space++;
            space2-=2;
           }
         row++; 
         
        System.out.println();
  
        }
       
    }
    
}
