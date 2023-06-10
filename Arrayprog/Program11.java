import java.util.*;
class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
       for(int i=0;i<n;i++){
            if(a[i]==1 | a[i]==4){
                c+=1;
            }
            else{
                System.out.print("False");
                break;
            }
        }
        if(c==n){
            System.out.print("True");
        }
    }
}
