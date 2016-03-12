/**
 * Created by adarsh on 3/10/2016.
 */
public class Main {
    public static void main(String[] args)
    {
       /* Account myAccount = new Account();
        myAccount.setAccountNumber(1001);
        myAccount.setBalance(3800.00);
        myAccount.setCustomerName("Adarsh Jayakumar");
        myAccount.setEmail("adarshjaya12@gmail.com");
        myAccount.setPhoneNumber("8155936714");
        myAccount.displayAccount(1001);
        myAccount.deposit(3878.12);
        myAccount.withdraw(1245.96);
        myAccount.displayAccount(1001);*/
        VipAccount myvip = new VipAccount();
        myvip.display();
        VipAccount myvip2 = new VipAccount("Adarsh","adarshjaya12@gmail.com");
        myvip2.display();
        VipAccount myvip3 = new VipAccount("Adarsh",1000.12,"adarshjaya12@gmail.com");
        myvip3.display();
    }
}
