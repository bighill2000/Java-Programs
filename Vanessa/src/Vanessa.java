import java.util.Scanner;

/**
 * Created by mrglass on 11/1/2015.
 */
public class Vanessa {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.print("enter you first number: ");
        x = in.nextInt();
        System.out.print("enter you second number: ");
        y = in.nextInt();
        System.out.println(x + "  " + y);
        System.out.println("Press 1 for +");
        System.out.println("Press 2 for -");
        System.out.println("Press 3 for *");
        System.out.println("Press 4 for /");
        System.out.print("Enter choice: ");
        String ans = in.nextLine();
        switch (ans) {
            case "1":
                System.out.println(x + " + " + y +" = " + (x+y));
                break;
            case "2":
                System.out.println(x + " - " + y +" = " + (x-y));
                break;
            case "3":
                System.out.println(x + " * " + y+ " = " + (x*y));
                break;
            case "4":
                System.out.println(x + " / " + y + " = " + (x/y));
                break;
        }


        System.exit(0);
    }
}
