package Constructor.AccountTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/27 21:33
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(){

    }
    public Account(int id ,int balance,double annualInterestRate){
            this.id=id;
            this.balance=balance;
            this.annualInterestRate=annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount){
        if((this.balance-amount)>=0){
            this.balance=this.balance-amount;
            System.out.println("你已经取出:"+amount);
            System.out.println();
            System.out.println("你的账户余额为:"+this.balance);
        }else{
            System.out.println("对不起，你的存款不足");
        }


    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
        System.out.println("你已成功存入:"+amount);
        System.out.println();
        System.out.println("你的余额还剩:"+this.balance);
    }
}
