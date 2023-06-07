import java.util.*;
class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(ch+"->"+Character.toLowerCase(ch));
        }
        else{
            System.out.println(ch+"->"+Character.toUpperCase(ch));
        }

    }
}
