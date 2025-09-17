abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        double balance = getBalance() + amount;
        setBalance(balance);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        double balance = getBalance() + amount;
        setBalance(balance);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Current Account");
        } else {
            System.out.println("Insufficient balance in Current Account");
        }
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount B = new SavingsAccount(45000);
        BankAccount B1 = new CurrentAccount(35000);

        System.out.println("\n Savings Account");
        B.deposit(5000);
        B.withdraw(10000);
        System.out.println("Final Balance: " + B.getBalance());

        System.out.println("\n Current Account");
        B1.deposit(3000);
        B1.withdraw(40000);
        System.out.println("Final Balance: " + B1.getBalance());
    }
}
