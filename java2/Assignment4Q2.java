package java2;

import java.util.Scanner;
class divison  {
    public static void solve() throws UnsupportedOperationException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter Dividend number:");
            int dividend = scanner.nextInt();
            System.out.println("Enter Divisor number:");
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                throw new UnsupportedOperationException("You have entered '0' value as divisor");
            }
            int result = dividend / divisor;
            System.out.println("Result is:" + result);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
public class Assignment4Q2 {

    public static void main(String[] args)  {
        divison.solve();
        }
}