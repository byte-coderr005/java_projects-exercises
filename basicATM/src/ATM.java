import java.util.Scanner;

public class ATM {
    private Account account;
    private Scanner sc;

    public ATM(Account account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void checkBalance() {
        System.out.println("Mevcut bakiye: " + account.getBalance());
    }

    public void deposit() {
        System.out.print("Yatırmak istediğiniz tutar: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    public void withdraw() {
        System.out.print("Çekmek istediğiniz tutar: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    public void start() {
        while (true) {
            System.out.println("Lütfen işlem seçin: ");
            System.out.println("1. Bakiye Kontrol");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");
            int choice = sc.nextInt();

            if (choice == 1) {
                checkBalance();
            } else if (choice == 2) {
                deposit();
            } else if (choice == 3) {
                withdraw();
            } else if (choice == 4) {
                System.out.println("Çıkış Yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
            }
        }
        sc.close();  // Close the scanner to avoid resource leaks
    }
}
