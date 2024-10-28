import java.util.Scanner;

abstract class Account {
     String customerName,accountNumber,accountType;
     double balance;

    Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    double getBalance() {
        return balance;
    }

    abstract void withdraw(double amount);
}

class SavAcct extends Account {
    double interestRate;

    SavAcct(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber, "Savings Account");
        this.interestRate = interestRate;
    }

    void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
        displayBalance();
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        }
    }
}

class CurAcct extends Account {
   static final double MIN_BALANCE = 1000.0;
   static final double SERVICE_CHARGE = 50.0;

    CurAcct(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current Account");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinimumBalance();
        }
    }

     void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Service charge applied: " + SERVICE_CHARGE);
        }
        displayBalance();
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Choose account type (savings/current): ");
        String accType = scanner.nextLine().toLowerCase();

        Account account;
        if (accType.equals("savings")) {
            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();
            account = new SavAcct(name, accNumber, interestRate);
        } else {
            account = new CurAcct(name, accNumber);
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.print(" 1. Deposit");
            System.out.print(" 2. Withdraw");
            System.out.print(" 3. Display Balance");
            System.out.print(" 4. Compute and Deposit Interest");
            System.out.println(" 5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                        ((SavAcct) account).computeAndDepositInterest();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}



