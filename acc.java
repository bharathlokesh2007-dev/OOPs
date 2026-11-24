class account {
    int accountNumber;
    void showAccount()
    {
        System.out.println("Acc No:" + accountNumber);
    }
}
class savingsAccount extends account{
    double interestrate;
    void showsavingdetails()
    {
        System.out.println("Interest rate:" + interestrate);
    }
}
class FixedDepositAccount extends savingsAccount{
    int lockInYears;
    void  showFDDetails()
    {
         System.out.println("lockInYears:" + lockInYears);
    }
}
public class acc {

    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 12345678;
        f.interestrate = 35.67;
        f.lockInYears = 3;
        f.showAccount();
        f.showsavingdetails();
        f.showFDDetails();

    }
}
