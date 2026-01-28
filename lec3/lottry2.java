package lec3;
import java.util.*;
public class lottry2 {
    
    public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number");
        n = sc.nextInt();
         if(n >= 300 && n <= 460){
            System.out.println("You won a macbook");
         }
         else if (n >= 200 && n <= 280){
            System.out.println("You won a Kurkure");
         }
         else if(n >= 1100 && n <= 1500){
            System.out.println("You won a Cycle");
         }
         else if(n >50 && n <= 80){
            if(n>50 && n<=65){
                System.out.println(" You won a Bullet");
            }
            else {
                System.out.println(" You won a Rajdoot");
            }
         }
         else{
            System.out.println("Better Luck Next Time");
         }
         sc.close();
     }
}
