import java.util.Scanner;

class Account {
    String customerName;
    String accountNumber;
    double balance;

    Account(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    private double interestRate;

    SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw from saving account: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurAcct extends Account {
    private double minimumBalance;
    private double serviceCharge;

    CurAcct(String customerName, String accountNumber, double initialBalance, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal would drop below minimum balance. Service charge applied.");
            balance -= serviceCharge;
        } else {
            balance -= amount;
            System.out.println("Withdraw from withdraw account: " + amount);
        }
    }
}

public class  BANK1 {
    public static void main(String[] args) {
        SavAcct savingsAccount = new SavAcct("Alice", "S001", 1000, 5);
        CurAcct currentAccount = new CurAcct("Bob", "C001", 2000, 500, 50);

       System.out.println("Saving account:");
        savingsAccount.computeAndDepositInterest();
        savingsAccount.withdraw(98);
        savingsAccount.displayBalance();

        System.out.println("Current account:");
        currentAccount.deposit(200);
        currentAccount.withdraw(1200);
        currentAccount.displayBalance();
    }
}
