import java.util.*;
class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(n+" is Zero");
        }
        else if(n>0){
            System.out.println(n+" is Positive");
        }
        else{
            System.out.println(n+" is Negative");
        }
    }
}
