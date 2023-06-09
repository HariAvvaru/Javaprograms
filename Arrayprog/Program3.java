import java.util.*;
class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{2,1,5,6,8,3,4,7};
        int target=sc.nextInt();
        int b=Arrays.binarySearch(a,target);
        if(b>=0)
        {
            System.out.println(target+" is found");
        }
        else
        {
            System.out.println(target+" is not found");
        }
    }
}
