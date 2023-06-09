import java.util.*;
class Program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'R' | 'r':
                System.out.println("Red");
                break;
            case 'B' | 'b':
                System.out.println("Blue");
                break;
            case 'G' | 'g':
                System.out.println("Green");
                break;
            case 'O' | 'o':
                System.out.println("Orange");
                break;
            case 'Y' | 'y':
                System.out.println("Yellow");
                break;
            case 'W' | 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
    }
}
