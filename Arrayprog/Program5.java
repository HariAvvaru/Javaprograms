import java.util.*;
class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{65,66,67,68,69,99};
        char ch;
        Arrays.sort(a);
        System.out.println("Largest two values are "+a[a.length-1]+" "+a[a.length-2]);
        System.out.println("Smallest two values are "+a[0]+" "+a[1]);
    }
}
