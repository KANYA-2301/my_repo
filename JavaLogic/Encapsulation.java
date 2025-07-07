class BankAccount{
    private int AccountNumber;
    private int AccountHolder;
    private int balance;
    int c;
    private int withdrawal;

    public void  setDeposit(int balance){
        this.balance=balance;

    }
    public int getDeposit(){
        return balance;
    }
    public void setWithdrawal(int withdrawal){
        this.withdrawal=withdrawal;

    }
    public int getWithdrawal(){
        return withdrawal;
    }
    public int getDisplay(){
        balance-=withdrawal;
        return balance;
    }

}
public class Encapsulation {
    public static void main(String[] args){
    BankAccount bank = new BankAccount();
      bank.setDeposit(10000);
      bank.setWithdrawal(5000);
      System.out.println(bank.getDisplay());

   }

}
