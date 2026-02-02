package LEC11;

public class Dec_To_Binary2{
    public static void main(String[] args) {
        int n = 25;
        int mul=1;
        int sum =0;
        
        

        while(n>0){
            int rem =n%2;
            sum =sum+rem*mul;
            n = n/2;
            mul = mul*10;
        }
        System.out.println(sum);




    }
    
}
