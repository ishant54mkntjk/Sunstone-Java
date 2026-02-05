package LEC11;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        int mul = 1;

        while(n>=1){
            // 
            int rem = n%10;
            
            n = n/10;
            sum += rem*mul;
            mul = mul*2;
            
        }
        System.out.println(sum);
       sc.close();
    }
}