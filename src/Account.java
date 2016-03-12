/**
 * Created by adarsh on 3/10/2016.
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }

    public void setPhoneNumber(String customerName)
    {
        this.phoneNumber = customerName;
    }
    public String getPhoneNumber()
    {
        return this.customerName;
    }

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount)
    {
        if(amount < this.balance)
            this.balance = this.balance - amount;
        else
            System.out.println("Insufficient funds");
    }
    public void displayAccount(int accountNumber)
    {
        if(accountNumber == this.accountNumber)
            System.out.println("Hello "+this.customerName+"\nYour account balance is "+this.balance+"");
    }
}
