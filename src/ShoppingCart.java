import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quentity;
        char currency = '$';
        double totalPrice = 0;

        System.out.print("Which product would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("How much price for Each one? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy? ");
        quentity = scanner.nextInt();

        totalPrice = price * quentity;

        System.out.println("\n You have brought " + quentity + " " + item);
        System.out.println("You have to pay total " + currency + totalPrice);

        
        scanner.close();
    }
}
