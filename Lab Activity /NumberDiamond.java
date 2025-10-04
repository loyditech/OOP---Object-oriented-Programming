import java.util.Scanner;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value for n: ");
        int maxNum = scan.nextInt();

        
        for (int i = 1; i <= maxNum; i++) {
            for (int j = 1; j <= maxNum - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = maxNum - 1; i >= 1; i--) {
            for (int j = 1; j <= maxNum - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scan.close();
    }
}
