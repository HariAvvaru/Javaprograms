import java.util.*;
class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+sum/n);
    }
}
