public class Main {
    public static void main(String[] args) {
        Account ac = new Account("123456789", 1000.0);
        ATM atm = new ATM(ac);
        atm.start();
    }
}