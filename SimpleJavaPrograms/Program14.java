/*Taking input as a integer and finding the sum of digits*/
import java.util.*;
class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int k=0;
        while(s!=0){
            int dig=s%10;
            k=k+dig;
            s=s/10;
        }
        System.out.println(k);
    }
}
(OR)
/*Taking input as a string and finding the sum of digits*/
import java.util.*;
class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=0;        
        for(int i=0;i<s.length();i++)
        {
            k+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(k);
    }
}
