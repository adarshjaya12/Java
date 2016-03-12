/**
 * Created by adarsh on 3/10/2016.
 */
public class VipAccount {
    private String name;
    private double creditLimit;
    private String email;

    public  VipAccount(String name, double creditLimit , String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email =  email;
    }

    public  VipAccount(String name , String email)
    {
        this(name,6000.00,email);
    }
    public VipAccount()
    {
        this("Unknown",1000.00,"No email address");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void display()
    {
        System.out.println("Hello "+this.name+" Your credit limit is" +this.creditLimit+" your email id is "+this.email);
    }

}
