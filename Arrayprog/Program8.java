import java.util.*;
class Program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]==6){
                int b=Arrays.binarySearch(a,7);
                if(b>i){
                    i=b;
                }
                else{
                    sum=sum+a[i];
                }
            }
            else{
                sum=sum+a[i];
            }
        }
        System.out.print(sum);
    }
}
