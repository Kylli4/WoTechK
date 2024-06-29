import java.util.ArrayList;
public class Shop {
    public void buyCheese(Client client, int cheeseId) {
        ArrayList<Cheese> cheeses = CheeseService.getCheeses();
        for (Cheese cheese : cheeses) {
            if (cheese.getId() == cheeseId) {
                client.buyCheese(cheese);
                return;
            }
        }
        System.out.println("Cheese with ID " + cheeseId + " not found.");
    }
}
