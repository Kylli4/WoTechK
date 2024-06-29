import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CheeseService cheeseService = new CheeseService();
    private static Shop shop = new Shop();
    private static Client client = new Client(1000);

    public static void main(String[] args) {
        while (true) {
            System.out.println("press 1, to add an item ");
            System.out.println("press 2, to print all items ");
            System.out.println("press 3, to remove an item ");
            System.out.println("press 4, to update an item ");
            System.out.println("press 5, to buy an item ");
            System.out.println("press 6, to exit ");
            int action = scanner.nextInt();
            if(action == 1) {
                addCheese();

            } else if(action == 2) {
                printCheeses();
            } else if(action == 3) {
                removeCheese();
            } else if(action == 4) {
                updateCheese();
            } else if(action ==5) {
                buyCheese();
            } else if(action == 6) {
                break;
            }

        }
    }
    public static void addCheese() {

        System.out.println("Provide an item id: ");
        int id = scanner.nextInt();
        System.out.println("Provide an item name: ");
        String name = scanner.next();
        System.out.println("Provide an item cost: ");
        int cost = scanner.nextInt();
        Cheese cheese = new Cheese(id, name, cost);
        CheeseService.addCheese(cheese);
    }

    public static void printCheeses() {
        System.out.println("These are the items in storage: ");
        ArrayList<Cheese> cheeses = cheeseService.getCheeses();
        for (Cheese cheese : cheeses) {
            System.out.println("ID: " + cheese.getId() + ", Name: " + cheese.getName() + ", Cost: " + cheese.getCost());
        }
    }
    public static void removeCheese() {
            System.out.println("Enter the ID you want to remove: ");
            int removeID = scanner.nextInt();
            cheeseService.removeCheese(removeID);
            System.out.println(removeID + " has been removed.");
            printCheeses();
        }

    public static void updateCheese() {
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter name: ");
            String name = scanner.next();
            System.out.println("Enter price: ");
            int cost = scanner.nextInt();
            cheeseService.updateCheese(id, name, cost);
            System.out.println("Item updated");
        }
    public static void buyCheese() {
        System.out.println("Enter the ID of the cheese you want to buy: ");
        int id = scanner.nextInt();
        shop.buyCheese(client, id);
    }
}





