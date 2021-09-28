package Constructor.AccountTest;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/27 21:51
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","Smith");
        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println(customer.getFirstName()+" "+customer.getLastName() +
                " has a account: id is "+account.getId()+", "+
                "annualInterestRate is "+account.getAnnualInterestRate()+", "
                +"balance is "+account.getBalance());

    }
}
