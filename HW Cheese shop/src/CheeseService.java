import java.util.ArrayList;
public class CheeseService {
    private static ArrayList<Cheese> cheeses = new ArrayList<>();

    public static ArrayList<Cheese> getCheeses() {
        return cheeses;
    }
    public static void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public void removeCheese(int id) {
        for( var cheese: cheeses) {
            if(cheese.getId() == id) {
                cheeses.remove(cheese);
                return;
            }
        }
    }

    public void updateCheese(int id, String name, int cost) {
        for(Cheese cheese: cheeses) {
            if(cheese.getId() == id) {
                cheese.setName(name);
                cheese.setCost(cost);
                return;
            }
        }
    }
}
