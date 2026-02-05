package lec4;
import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("nu");
    int n = sc.nextInt();
    int row=1;
    int star =n*2-1;
    int star2 = 4;
    int space =1;

    while(row<=n*2-1){
        // star
        int i =1;
        while(i <=star){
            if(row == 1 || row == n*2-1 ){
            System.out.print("*");
            }
            else{
                System.out.print("");
            }
            i++;
        }
        System.out.println();
        if(row >=2 || row < n*2-2){
            //Star
            int j =1;
            while(j <= star2){
                System.out.print("*");
                j++;
            }
            // Space
            int k =1;
            while(k <=space){
                System.out.print(" ");
                k++;
            }

            // Star
            int l =1;
            while(l <= star2){
                System.out.print("*");
                l++;
            }

            if( row<n){
                star2--;
                space+=2;
            }
            else{
                star2++;
                space-=2;
            }
        }
        
        // Next Line 5
         row++;
         System.out.println();
    }
    }
 }
