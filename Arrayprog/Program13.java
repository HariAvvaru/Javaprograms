
import java.util.*;
class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(args.length!=4){
            System.out.print("Please enter 4 integer numbers");
        }
        else{
            printArr(args);
            printrevArr(args);
        }
    }
    public static void printArr(String[] a){
        int k=0;
        System.out.println("The given array is ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[k]+" ");
                k+=1;
            }
            System.out.println();
        }
    }
    public static void printrevArr(String[] a){
        int k=4;
        System.out.println("The reverse given array is ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                k-=1;
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
