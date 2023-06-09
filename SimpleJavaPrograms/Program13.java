import java.util.*;
class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<m;i++){
            int k=(int)Math.sqrt(n);
            int c=0;
            for(int j=2;j<=k;j++){
                if(i%j==0){
                    c=1;
                }
            }
            if(c==0){
                System.out.println(i);
            }
        }
    }
}
