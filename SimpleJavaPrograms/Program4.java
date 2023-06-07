import java.util.*;
class Program4 {
    public static void main(String[] args) {
        //System.out.println("Hi");
        Scanner sc=new Scanner(System.in);
        char a1=sc.next().charAt(0);
        char a2=sc.next().charAt(0);
        if(a1>a2){
            System.out.println(a2+","+a1);
        }
        else{
            System.out.println(a1+","+a2);
        }
    }
}
