import java.util.*;
class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{1,4,34,56,7};
        int target=sc.nextInt();
        int b=Arrays.binarySearch(a,target);
        if(b<0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(b+" is the index");
        }
    }
}
