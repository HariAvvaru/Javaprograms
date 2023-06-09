import java.util.*;
class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Minimum value is: "+a[0]);
        System.out.println("Maximum value is: "+a[n-1]);
    }
}
