import java.util.*;
class Program16 {
    public static void main(String[] args) {
        //System.out.println("HI");
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
