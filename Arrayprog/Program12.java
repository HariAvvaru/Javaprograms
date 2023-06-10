import java.util.*;
class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a= new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
        }
        middleWay(a,b);
    }
    public static void middleWay(int[] a,int[] b){
        int k = (int) Math.ceil(3/2);
        int[] c=new int[2];
        c[0]=a[k];
        c[1]=b[k];
        System.out.print("["+c[0]+","+c[1]+"]");
    }
}
