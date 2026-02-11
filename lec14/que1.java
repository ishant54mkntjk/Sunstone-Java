import java.util.*;
public class que1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a =0;
        int b =0;
        int c =1;

        while(n>0){
            int rem = n%10;
            if(c%2==0){
                a =a+rem;
            }
            else{
                b =b+rem;
            }
            
           n= n/10;
            c++;
        
        }
        System.out.println(a);
        System.out.println(b);
        
sc.close();
    }
    
}