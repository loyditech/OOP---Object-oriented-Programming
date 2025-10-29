import java.util.Scanner;
public class SuperDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number (up to 18 digits): ");
        String numberStr = input.nextLine();
        
        
        if (!numberStr.matches("\\d+") || numberStr.length() > 18) {
            System.out.println("Enter a positive integer up to 18 digits only.");
            return;
        }
        long number = Long.parseLong(numberStr);
        
        
        int superDigit = findSuperDigit(number);
        
        System.out.println("Super Digit of " + number + " : " + superDigit);
        input.close();
    }
    
    public static int findSuperDigit(long num) {
        if (num < 10) {
            return (int) num;
            
        }
        
        long sum = 0;
        while (num > 0) {
            sum += (num % 10);  
            num /= 10;  
        }
        
        return findSuperDigit(sum);
    }
}
