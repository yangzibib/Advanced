package Constructor.MutAccount;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/27 22:46
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("yang","zibin");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(  bank.getCustomer(0).getFirstName()+  bank.getCustomer(0).getLastName());

    }

}
