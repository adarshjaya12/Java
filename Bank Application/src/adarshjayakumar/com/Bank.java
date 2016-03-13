package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/12/2016.
 */
//Add a new Branch
// Add a customer to that branch with initial transaction
//Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list of their transcations

public class Bank {
    private String bankName;
    ArrayList<Branch> myBranchArray ;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.myBranchArray = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String bankLocation)
    {
        if(findBranch(bankLocation) == null)
        {
            this.myBranchArray.add(new Branch(bankLocation));
            System.out.println("branch Added");
            return true;
        }
    return false;
    }
    public boolean addCustomer(String branchName,String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            System.out.println("Account Created");
            return branch.createNewAccount(branchName,customerName,initialAmount);
        }
        return false;
    }

    public void printBranch()
    {
        for(int i=0; i<myBranchArray.size();i++)
        {
            System.out.println(myBranchArray.get(i).getBranchCity());
        }
    }

    private Branch findBranch(String branchName)
    {
        for(int i =0 ; i<myBranchArray.size();i++ )
        {
            Branch findBranch = myBranchArray.get(i);
            if(myBranchArray.get(i).getBranchCity().equals(branchName))
            {
                return findBranch;
            }
        }
        return null;
    }

    public boolean addTransaction(String branchName,String customerName,double transactionAmount)
    {
        Branch exisitingBranch = findBranch(branchName);
        if(exisitingBranch!= null)
        {
            exisitingBranch.creditAccount(customerName,transactionAmount);
            return true;
        }
        return false;
    }
    public void printTransactionDetails(String branchName)
    {
        ArrayList<Branch> newBranchArray = new ArrayList<Branch>();
        for(int i=0 ; i <myBranchArray.size();i++)
        {
            if(myBranchArray.get(i).getBranchCity().equals(branchName))
            {
                newBranchArray.add(myBranchArray.get(i));

            }
        }

        for(int i=0 ; i < newBranchArray.size() ; i++)
        {
            System.out.println(newBranchArray.get(i).getBranchCity());
            System.out.println(newBranchArray.get(i).getMyCustomer().get(i).getCustomerName());
            System.out.println(newBranchArray.get(i).getMyCustomer().get(i).getCustomerTransaction().get(i).doubleValue());
        }

    }
    public  void dummyPrint()
    {
        for(int i=0 ; i < myBranchArray.size();i++)
        {
            System.out.println(myBranchArray.get(i).getBranchCity());
            System.out.println(myBranchArray.get(i).getMyCustomer().get(i).getCustomerName());
            //System.out.println(myBranchArray.get(i).getMyCustomer().get(i).getCustomerTransaction().get(i).doubleValue());
        }
    }

}
