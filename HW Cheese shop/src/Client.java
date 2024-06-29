import java.util.ArrayList;
class Client {
    private int money;
    private ArrayList<Cheese> ownedCheeses = new ArrayList<>();

    public Client(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Cheese> getOwnedCheeses() {
        return ownedCheeses;
    }

    public void buyCheese(Cheese cheese) {
        if (money >= cheese.getCost()) {
            money -= cheese.getCost();
            ownedCheeses.add(cheese);
            System.out.println("Bought cheese: " + cheese.getName());
        } else {
            System.out.println("Not enough money to buy cheese: " + cheese.getName());
        }
    }
}