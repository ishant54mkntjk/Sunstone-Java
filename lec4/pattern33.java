package lec4;
public class pattern33{
    public static void main(String[] args){
        int n =10;
        int row =1;
        int space =n;
        int star = 1;
        int var =n;

        while(row<=n){
            // space
            int i =1;
            while(i<=space){
                System.out.print(" \t");
                i++;
                
            }
            //Star
            int j=1;
            while(j<=star){
                if( var == n){
                    System.out.print("0\t");
                }
                else{
                System.out.print(var+"\t");
                }

                if(j<row){
                    var++;
                }
                else{
                    var--;
                }

                j++;
            }
            
            row++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}