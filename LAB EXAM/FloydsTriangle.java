import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the number of rows (1-20): ");
        int rows = value.nextInt();

       
        if (rows < 1 || rows > 20) {
            System.out.println("Enter a number between 1 and 20.");
        } else {
            System.out.println("Floyd's Triangle with " + rows + " rows:");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    int num = i * (i - 1) / 2 + j;
                    System.out.printf("%-4s", num );
                }
                System.out.println();
            }
        }
        value.close();
    }
}
