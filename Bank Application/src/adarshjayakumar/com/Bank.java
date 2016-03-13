package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/12/2016.
 */
//Add a new Branch
// Add a customer to that branch with initial transaction
//Add a transaction for an existing customer for that branch
    // Show a list opf customers for a particular branch and optionally a list
    // of their transcations

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
            return true;
        }
    return false;
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
    public boolean addCustomer(String branchName,String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.createNewAccount(branchName,customerName,initialAmount);
        }
        return false;
    }
}
