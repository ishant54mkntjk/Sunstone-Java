package practices;
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int t1 =n;
        int length = 0;
        int t2 =n;
        int arm =0;

        while(t1 !=0){
            t1 = t1/10;
            length = length+1;
        }

        while(t2 !=0){
            int rem = t2/10;
            int mul =1;
            for(int i =1; i<=length; i++){
                mul = mul*rem;
            }
            arm =arm+mul;
        }
        if(n == arm){
            System.out.println("Num. is Armstorm");
        }
    }
    
}
