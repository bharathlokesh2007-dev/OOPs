class BankAccount {
    private String AccountHolder = "Bharath";
    private double balance = 100023;

    public String getter() {
        return AccountHolder;
    }

    public void setname(String n) {
        AccountHolder = n;
    }

    public double getrollnumber() {
        return balance;
    }

    public void setrollnumber(double r) {
        if (r < 0) {
            System.out.println("Invalid Balance");
        } else {
            balance = r;
            System.out.println(balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}

public class mainer {
    public static void main(String[] args) {
        BankAccount s = new BankAccount();

        System.out.println(s.getter());
        System.out.println(s.getrollnumber());

        s.deposit(5000);
        s.withdraw(2000);

        s.setrollnumber(-1000);
        s.setname("Dhruv");

        System.out.println(s.getter());
        System.out.println(s.getrollnumber());
    }
}