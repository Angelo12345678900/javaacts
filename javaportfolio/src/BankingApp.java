import java.util.Scanner;

public class BankingApp {
    private static User[] users = {
            new User(412435, 7452, "Chris Sandoval", 32000),
            new User(264863, 1349, "Marc Yim", 1000)
    };
    private static User loggedUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (login(scanner)) {
            int option;
            do {
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Cash-in");
                System.out.println("3. Transfer Money");
                System.out.println("4. Logout");
                System.out.print("Select an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        cashIn(scanner);
                        break;
                    case 3:
                        transferMoney(scanner);
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        loggedUser = null;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } while (option != 4);
        }
        scanner.close();
    }

    private static boolean login(Scanner scanner) {
        System.out.print("Enter User ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        for (User user : users) {
            if (user.getId() == id && user.getPin() == pin) {
                loggedUser = user;
                System.out.println("Login successful. Welcome, " + loggedUser.getName() + "!");
                return true;
            }
        }
        System.out.println("Invalid User ID or PIN. Please try again.");
        return false;
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + loggedUser.getBalance());
    }

    private static void cashIn(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        loggedUser.deposit(amount);
    }

    private static void transferMoney(Scanner scanner) {
        System.out.print("Enter recipient User ID: ");
        int recipientId = scanner.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();

        User recipient = findUserById(recipientId);
        if (recipient != null) {
            loggedUser.transfer(recipient, amount);
        } else {
            System.out.println("Recipient not found.");
        }
    }

    private static User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
