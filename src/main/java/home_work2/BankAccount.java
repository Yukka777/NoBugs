package home_work2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance){
        this.owner = someOwner;
        this.balance = someBalance;}

    String getOwner(){
        return this.owner;}

    int getBalance(){
        return this.balance;}

    void setOwner(String newOwner){
        this.owner=newOwner;}

    int deposit(int amount){
        return balance = amount + this.balance;}
    int withdraw(int amount){
            return balance = this.balance - amount;
        }
    void printBalance(){
            System.out.println( "Баланс: " + balance);
        }
    }

