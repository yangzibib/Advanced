package Constructor.MutAccount;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/27 22:21
 */
public class Account {
    private double balance;
    public Account(double balance){
        this.balance=balance;

    }

    public double getBalance() {
        return this.balance;
    }
    public void deposit(double account){
        this.balance=this.balance+account;
        System.out.println("存款成功，你的余额为"+this.balance);
    }
    public void withdraw(double account){
      if(this.balance>=account){
      this.balance=this.balance-account;
          System.out.println("取款成功，你的余额为"+this.balance);
      }
      else {
          System.out.println("对不起，你的余额不足");
      }
    }
}
