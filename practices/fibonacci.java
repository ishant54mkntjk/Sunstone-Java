package practices;
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();   
        int row =1;
        int star =1;
        int a =1;
        int b =1;
        int c =a+b;

        while(row <=n){
            int i=1;
            
            while(i<=star){
                if(row ==1 ){
                    System.out.print("0 ");
                }
                else if(row ==2){
                System.out.print("1 ");
                }
                
                else if(row>2){
                    System.out.print(c+" " );
                    a =b;
                b =c;
                c =a+b;

                    
                }

                i++;
            }
            row++;
            star++;
            
            
            System.out.println();
            
        }
    }
}    