import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

/*******************************************************************/
class BankAccount {
    private String name;
    private int accountNumber;

    private double balance;
    private String pin;

    public BankAccount(String name, int accountNumber, double balance, String pin) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                throw new InsufficientFundsException("Insufficient funds in the account.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

/*******************************************************************/
// custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

/*******************************************************************/
public class AtmManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("abebe", 123456, 1000, "1111");

        int choice = -1;
        do {
            System.out.println("\n*********************ATM Menu*********************");

            Console console = System.console();
            if (console == null) {

                System.out.println("enter your account number(123456)");
                Scanner acc = new Scanner(System.in);
                int an = acc.nextInt();
                System.out.println("Enter your pin to continue(1111): ");

                int enteredPin = scanner.nextInt();
                if (enteredPin != Integer.parseInt(account.getPin()) && an == account.getAccountNumber()) {
                    System.out.println("Invalid Credential. Please try again.");
                    continue;
                } else {

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                }

            }

            else {
                System.out.println("enter your account number(123456)");
                Scanner acc = new Scanner(System.in);
                int an = acc.nextInt();
                char[] password = console
                        .readPassword("Enter your pin carefully it is not echoed for security purpose(1111): ");
                if (!(new String(password).equals(account.getPin())
                        && an == account.getAccountNumber())) {
                    System.out.println("Invalid Credential. Please try again.");
                    continue;
                } else {

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                }
            }
            ////

            ////

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }
            ////////////////
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    try {
                        double depositAmount = scanner.nextDouble();

                        account.deposit(depositAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.nextLine(); // Clear the invalid input
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    try {
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.nextLine(); // Clear the invalid input
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());

                    break;
                case 4:
                    System.out.println("Exiting ATM...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
