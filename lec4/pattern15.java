package lec4;

public class pattern15 {
    public static void main(String[] args){
    int n = 5;
    int row =1;
    int star =5;
    int space = 0;

    while(row <= n*2-1){
        // star
        int i = 1;
        while(i <= space){
            System.out.print("   ");
            i++;
        }
        // Space 
        int j =1;
        while(j <= star){
            System.out.print("  *");
            j++;
        }
        if(row < n){
        space+=2;
        star--;
       
        }
        else{
             space-=2;
        star++;
        }
         row++;
        System.out.println();
    }
    
}
}
