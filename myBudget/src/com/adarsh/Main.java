package com.adarsh;
import java.util.ArrayList;
import java.util.Scanner;
class Main
{
    boolean loopValue = true;
    String userName;
    Operation operation;
    public Main(String username)
    {
        this.userName = username;
        displayMenu();
    }
    public void displayMenu()
    {
        operation = new Operation();
        Scanner myScanner = new Scanner(System.in);
        int switchResult;
        while(loopValue)
        {
            System.out.println("Welcome to MY BUDGET");
            System.out.println("Choose from the List");
            System.out.println("1. Add budget");
            System.out.println("2. Remove budget");
            System.out.println("3. Edit");
            System.out.println("4. Display");
            System.out.println("5. To exit");
            System.out.println("Choose the option");
            switchResult = myScanner.nextInt();
            switch(switchResult)
            {
                case 1:
                    operation.addBudget();
                    break;
                case 2:
                    operation.removeBudget();
                    break;
                case 3:
                    operation.editBudget();
                    break;
                case 4:
                    operation.displayBudget();
                    break;
                case 5:
                    loopValue = false;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Main> arrayList = new ArrayList<Main>();
        System.out.println("Enter username");
        String userName = scanner.next();
        Main menu = new Main(userName);
        arrayList.add(menu);
        System.out.println("Thank You");
    }
}
