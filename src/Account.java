public class Account {
    String name;
    private int accountNumber;
    private int balance;
    private int deposit;

    public Account(String name, int accountNumber, int balance, int deposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.deposit = deposit;
    }
    public void print(){
        System.out.println(this.name + " " + this.accountNumber + " " + this.balance + " " + this.deposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
