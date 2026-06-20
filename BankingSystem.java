import java.util.Scanner;

public class BankingSystem {

    static String accountHolder;
    static int accountNumber;
    static double balance;

    public static void createAccount(Scanner sc) {

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Initial Deposit:Rs. ");
        balance = sc.nextDouble();

        System.out.println("\nAccount Created Successfully!");
    }

    public static void deposit(Scanner sc) {

        System.out.print("Enter Amount to Deposit:Rs. ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!!!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public static void withdraw(Scanner sc) {

        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void displayDetails() {

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Holder Name : " + accountHolder);
        System.out.println("Account No  : " + accountNumber);
        System.out.println("Balance     : Rs." + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("===== JAVA BANKING SYSTEM =====");

        createAccount(sc);

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Account");
            System.out.println("4. Exit");

            System.out.print("Choose Option: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    deposit(sc);
                    break;

                case 2:
                    withdraw(sc);
                    break;

                case 3:
                    displayDetails();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}