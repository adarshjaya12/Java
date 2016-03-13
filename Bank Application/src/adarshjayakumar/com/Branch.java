package adarshjayakumar.com;

import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by adarsh on 3/12/2016.
 */
//Need to be able to add new customer and initial transcation amount
//Aslo need to add additional transcation for that customer/branch
public class Branch {
    private String branchCity;
    private ArrayList<Customers> myCustomer;

    public Branch(String branchCity) {
        this.branchCity = branchCity;
        myCustomer = new ArrayList<Customers>();
    }

    public boolean createNewAccount(String branchCity ,String customerName,double initialAmount){
        if(findCustomer(customerName) == null)
        {
            this.branchCity = branchCity;
            this.myCustomer.add(new Customers(customerName,initialAmount));
            return true;
        }
        else
            return false;
    }

      public boolean creditAccount(String customerName,double transactionAmount)
    {
        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null)
        {
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName)
    {
        for(int i=0; i<this.myCustomer.size();i++)
        {
            Customers existingCustomer = this.myCustomer.get(i)
;            if(myCustomer.get(i).getCustomerName().equals(customerName))
                return existingCustomer;
        }
        return null;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public ArrayList<Customers> getMyCustomer() {
        return myCustomer;
    }
}
