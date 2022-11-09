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

}
