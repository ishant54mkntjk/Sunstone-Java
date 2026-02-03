package lec4;
import java.util.*;
 public class prt{
     public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
         int n= sc.nextInt();
         int row =0;
         int space=n-1;
         int star =1;

         while(row<n){
             // space
             int i=0;
             while(i<space){
                 System.out.print("  ");
                 i++;
             }
             // Star
             int j =0;
             while(j< star){
                 System.out.print("* ");
                 j++;
             }
             
             // space
             int k=0;
             while(k<space){
                 System.out.print("  ");
                 k++;
             
             System.out.println();
             row++;
             if(row<=n/2){
                 space--;
                 star+=2;
             }
             else{
                 space++;
                 star-=2;
             }
         }
     }
     sc.close();
     }
 
    
}
