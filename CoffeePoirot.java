import java.util.Scanner;

public class CoffeePoirot {
    public static void main (String[] args){
        Scanner order = new Scanner (System.in);

        int[] orderList = new int[100];
        int orderNum = 0;

    
    System.out.println("Welcome to Coffee Patriot, Beika City!");
    System.out.println("Please choose from our menu:");
    System.out.println("1 - Coffee");
    System.out.println("2 - Tea");
    System.out.println("3 - Smoothie");
    System.out.println("4 - Exit (Checkout)");

    while(true){
        System.out.print("Enter your beverage: ");
        int choice = order.nextInt();

        if(choice == 4){
            break;
        } else if (choice < 1 || choice > 4){
            System.out.println("Invalid choice. Please try again.");

        } else {
            orderList[orderNum] = choice;
            orderNum++;
        }

        }
    System.out.println();
    for(int i = 0; i < orderNum; i++){
        switch(orderList[i]){
            case 1: System.out.println("Bitter but energizing!");
                break;
            case 2: System.out.println("Soothing and calming!");
                break;
            case 3: System.out.println("Cold and refreshing!");
                break;
        }
    }
    System.out.println();
    System.out.println("Thank you for visiting Coffee Poirot!");
    order.close();

    }
}
