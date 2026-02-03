package LEC11;

public class Binary_To_Dec2 {
    public static void main(String[] args){
        int n=101111;
        int mul=1;
        int sum =0;
        int dec =10;


        while(n>0){
            int rem = n%dec;
            sum = sum+rem*mul;
            n = n/dec;
            mul = mul*2;
            
        }
        System.out.println(sum);
    }
    
}
