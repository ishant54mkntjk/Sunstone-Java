package lec3;
import java.util.*;
public class profitloss {

    public static void main(String[] args) {
        int cp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your cp");
        cp = sc.nextInt();

        int sp;
        // Scanner n = new Scanner(System.in);
        System.out.println("Enter your sp");
        sp = sc.nextInt();

        if (cp>sp){
            System.out.println("Loss");
            System.out.println(cp-sp);
        }
        else {
            System.out.println("Profit :"+ (sp-cp));
            // System.out.println(sp-cp);
        }
        sc.close();
    }
    
}
