import java.util.Scanner;

public class BankView {
    Scanner sc = new Scanner(System.in);

    public String getAccountHolder() {
        System.out.print("Enter account holder: ");
        return sc.nextLine();
    }

    public double getInitialBalance() {
        System.out.print("Enter initial balance: ");
        return sc.nextDouble();
    }

    public double getDepositAmount() {
        System.out.print("Enter deposit amount: ");
        return sc.nextDouble();
    }

    public double getWithdrawAmount() {
        System.out.print("Enter withdrawal amount: ");
        return sc.nextDouble();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayAccount(String name, double balance) {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Final Balance: " + balance);
    }
}