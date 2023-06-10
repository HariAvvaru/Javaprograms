import java.util.*;
class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]!=10){
                System.out.print(a[i]+"\t");
            }
            else{
                c+=1;
            }
        }
        while(c!=0){
            System.out.print("0\t");
            c-=1;
        }
        
    }
}
