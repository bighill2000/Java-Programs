import java.util.Scanner;

/**
 * Created by mrglass on 11/9/2015.
 */
public class Homework4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ans = 0;
        do {
            System.out.println("__________________________");
            System.out.println("1: For Sum of Numbers");
            System.out.println("2: For Pennies for Pay");
            System.out.println("3: For Celsius to Fahrenheit table");
            System.out.print("Enter Choice: ");
            ans = in.nextInt();
            if (ans == 1)
                nums();
            if (ans == 2)
                pay();
            if (ans == 3)
                table();
        } while (ans != 4);
    }

    private static void table() {
        int[] cel = new int[21];
        double[] fah = new double[21];

        for (int i = 0; i < cel.length; i++) {
            cel[i] = i;
            fah[i] = (9 / 5) * (double) i + 32;
        }
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("----------------------");
        for (int i = 0; i < cel.length; i++) {
            System.out.printf("%-10s | %-10.2f \n", cel[i], fah[i]);
        }

    }

    private static void pay() {

    }

    private static void nums() {
        int ans = -1;
        int hold = 0;
        do {
            System.out.print("Enter a number greater than 0: ");
            try {
                ans = in.nextInt();
            } catch (Exception e) {
                System.out.println("ONLY NUMBERS!!!!!!!");
            }
        } while (ans <= 0);
        for (int i = 0; i <= ans; i++) {
            hold += i;
        }
        System.out.println("The sum of the numbers is: " + hold);
    }
}
