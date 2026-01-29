package lec9;

public class primefactorial {
    public static void main(String[] args) {
        int n =378;
        int i =2;

        for(i =2; i<=n;){
            if(n%i == 0){
                 n =n/i;
                 System.out.println(i);
            }
            else{
                i++;
            }
        }

    }
    
}
