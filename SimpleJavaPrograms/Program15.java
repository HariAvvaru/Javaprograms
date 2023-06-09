import java.util.*;
class Program15 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please enter an integer number");
        }
        else{
            int k=Integer.parseInt(args[0]);
            int i=0;
            while(i<k){
                for(int j=0;j<=i;j++){
                    System.out.print("*\t");
                }
                System.out.println();
                i++;
            }
        }
    }
}
