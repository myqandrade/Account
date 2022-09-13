package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw + 5.00;
    }

    @Override
    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, holder, balance);
    }

    public int getNumber(){
        return number;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public double getBalance(){
        return balance;
    }
}
