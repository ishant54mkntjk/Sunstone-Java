package LEC11;

public class Binary_To_Dec {
    public static void main(String[] args) {
        int n= 100111;
        int sum =0;
        int dec =10;
        int src = 1;
        int mul =1;
        

        while(n>0){
            int rem =n%dec;
            sum = sum+rem*src;
            n = n/dec;

        }
        System.out.println(sum);
    }
    
}
