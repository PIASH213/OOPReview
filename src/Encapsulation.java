class Wallet {
    private int money;

    public void addMoney(int amount) {
        money = amount; // just set the money
    }

    public int getMoney() {
        return money;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addMoney(300);
        System.out.println(myWallet.getMoney());
    }
}
