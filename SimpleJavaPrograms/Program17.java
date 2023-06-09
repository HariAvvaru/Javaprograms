import java.util.*;
class Program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int k=0;
        while(n!=0){
            int dig=n%10;
            k=k*10+dig;
            n=n/10;
        }
        if(k==m){
            System.out.print(m+" is a Palindrome");
        }
        else{
            System.out.print(m+" is not a Palindrome");
        }
    }
}
