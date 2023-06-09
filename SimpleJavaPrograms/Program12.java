import java.util.*;
class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c+=1;
            }
        }
        if(c>=1){
            System.out.println(n+" is not a Prime Number");
        }
        else{
            System.out.println(n+" is a Prime Number");
        }
    }
}
