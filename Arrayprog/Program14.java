import java.util.*;
class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(args.length!=9){
            System.out.print("Please enter 9 integer numbers");
        }
        else{
            printArr(args);
        }

    }
    public static void printArr(String[] a){
        int k=0;
        int max=0;
        System.out.println("The given array is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[k]+" ");
                int b=Integer.parseInt(a[k]);
                if(max<b){
                    max=b;
                }
                k+=1;
            }
            System.out.println();
        }
        System.out.println("The biggest number in the given array is "+max);
    }
}
