package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/12/2016.
 */
public class Customers {
    private String customerName;
    private ArrayList<Double> customerTransaction;

    public Customers(String customerName,double transaction) {
        this.customerName = customerName;
        customerTransaction = new ArrayList<Double>();
        customerTransaction.add(transaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double amount)
    {
        this.customerTransaction.add(amount);
    }

    public ArrayList<Double> getCustomerTransaction() {
        return customerTransaction;
    }
}
