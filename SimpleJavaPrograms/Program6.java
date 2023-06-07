import java.util.*;
class Program6 {
    public static void main(String[] args) {
        String gender = args[0];
        int x = Integer.parseInt(args[1]);

        if (gender.equals("Male") && (x >= 1 && x <= 58)) {
            System.out.println("Percentage of interest is 8.4%");
        }
        if (gender.equals("Male") && (x >= 59 && x <= 100)) {
            System.out.println("Percentage of interest is 10.5%");
        }
        if (gender.equals("Female") && (x >= 1 && x <= 58)) {
            System.out.println("Percentage of interest is 8.2%");
        }
        if (gender.equals("Female") && (x >= 59 && x <= 100)) {
            System.out.println("Percentage of interest is 9.2%");
        }
    }
}
