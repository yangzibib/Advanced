package Constructor.MutAccount;

/**
 * @author Administrator_master
 * @description: TODO
 * @date 2021/9/27 22:33
 */
public class Bank {
    private Customer[] customers=new Customer[100];
    private int numberOfCustomers;

    public Bank() {
    }
    public void addCustomer(String firstName,String lastName){
            Customer customer=new Customer(firstName,lastName);
            this.customers[this.numberOfCustomers]=customer;
            this.numberOfCustomers+=1;
    }
    public int getNumberOfCustomers(){
        return this.numberOfCustomers;
    }
    public Customer getCustomer(int index){
        if(index>=0 &&index<numberOfCustomers)
        return this.customers[index];
        else {
            System.out.println("用户不存在");
            return null;}
    }

}
