import java.util.Scanner;

public class NaniwaHarukas{
    public static void main(String[] args) {
        System.out.println("WELCOME TO NANIWA HARUKAS!");
        System.out.println();


        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the first term (a1): ");
        int a1 = input.nextInt();


        System.out.print("Enter the common difference (d): ");
        int d = input.nextInt();
   
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();


        System.out.println();


        System.out.print("Arithmetic Sequence: ");
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int nextnum = a1 + (i-1) * d;
            System.out.print(nextnum + " ");
            sum += nextnum;
       
        }
        System.out.println();
        System.out.print("Sum of sequence = " + sum);
        System.out.println();


        if (sum == 60){
            System.out.println("Welcome to the Observation Deck.");
            System.out.println("\"It's a beautiful sunset, isn't it?\"");
        } else if (sum % 5 == 0 && sum % 3 == 0){
            System.out.println("Welcome to the Souvenir Shop.");
        } else if (sum % 3 == 0){
            System.out.println("Welcome to the Restaurant and Sky Garden.");
        } 
        input.close();
    }
}