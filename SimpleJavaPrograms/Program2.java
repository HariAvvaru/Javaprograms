import java.util.*;
class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m%10 == n%10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
