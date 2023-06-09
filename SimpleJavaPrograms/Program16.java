import java.util.*;
class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(n!=0){
            int dig=n%10;
            k=k*10+dig;
            n=n/10;
        }
        System.out.print(k);
    }
}
or
import java.util.*;
class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String k="";
        while(n!=0){
            String dig=String.valueOf(n%10);
            k+=dig;
            n=n/10;
        }
        System.out.print(k);
    }
}
