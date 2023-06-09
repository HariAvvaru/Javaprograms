import java.util.*;
class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                a[i+1]=0;
            }
        }
        for(int k:a){
            if(k!=0){
                System.out.print(k+" ");
            }
            else{
                continue;
            }
        }
    }
}
