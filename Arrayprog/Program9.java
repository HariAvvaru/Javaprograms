import java.util.*;
class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+"\t");
            }
            else{
                b[j]=a[i];
                a[i]=-1;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(b[i]+"\t");
        }
    }
}
