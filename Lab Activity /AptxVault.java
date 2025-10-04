import java.util.Scanner;

public class AptxVault {
    public static int[] getPasscodes() {
        Scanner scan = new Scanner(System.in);
        int[] passcodes = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter passcode " + (i + 1) + ": ");
            passcodes[i] = scan.nextInt();
        }
        return passcodes;
    }

    public static boolean isVaildPasscodes(int[] passcodes) {
        for (int code : passcodes) {
            if (code < 450 || code > 3000) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int[] passcodes) {
        int total = 0;
        for (int code : passcodes) {
            total += code;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] passcodes = getPasscodes();

        if (!isVaildPasscodes(passcodes)) {
            System.out.println("Vault remains locked");
            return;
        }

        if (sum(passcodes) == 4869) {
            System.out.println("Vault unlocked with: " 
                + passcodes[0] + ", " + passcodes[1] + ", " + passcodes[2]);
        } else {
            System.out.println("Vault remains locked.");
        }
    }
}
