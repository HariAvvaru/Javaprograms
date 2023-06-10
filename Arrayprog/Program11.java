import java.util.*;
class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(only14(a));
    }
    public static boolean only14(int[] a){
        for(int k:a){
            if(k!=1 && k!=4)
                return false;
        }
        return true;
    }
}
