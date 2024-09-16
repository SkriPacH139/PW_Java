public class BankAccount {
    private int count;
    private UniqueID id = new UniqueID(7, "bankAcc: ",count);

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        count++;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
