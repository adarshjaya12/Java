package adarshjayakumar.com;

import java.util.ArrayList;

/**
 * Created by adarsh on 3/12/2016.
 */
public class MobilePhone {

  //  private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone() {
    //    this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts myContact)
    {
        if(findContact(myContact.getName()) >=0)
        {
            System.out.println("Contact already in file");
            return false;
        }
        else
        {
            myContacts.add(myContact);
            System.out.println("Contact Added");
            return true;
        }
    }
    private int findContact(Contacts myContact)
    {
        return this.myContacts.indexOf(myContact);
    }

    private int findContact(String myContact)
    {
        for(int i=0;i<this.myContacts.size();i++)
        {
            Contacts myContacts = this.myContacts.get(i);
            if(myContacts.getName().equals(myContact))
                return 1;
        }
        return -1;
    }
    public boolean modifyContact(Contacts oldContact, Contacts newContact)
    {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName()+" was not found");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        return true;
    }

    public void  printContact()
    {
        System.out.println("\tCONTACT LIST");
        for(int i=0;i< myContacts.size();i++)
        {
            System.out.println("Contact Name : "+myContacts.get(i).getName());
            System.out.println("Phone number : "+myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean remove(String contactName)
    {
        for(int i=0;i<myContacts.size();i++)
        {
            if(myContacts.get(i).getName() == contactName)
            {
                myContacts.remove(i);
                return true;
            }

        }
        return false;
    }
    public void removeContact(String contactName)
    {
        if(remove(contactName))
            System.out.println("Contact has been removed");
        else
            System.out.println("Contact not found");

    }

    public String modifyContactName(String oldContactName,String newContactName)
    {
        for(int i =0 ;i <myContacts.size(); i++)
        {
            if(myContacts.get(i).getName() == oldContactName) {
                String phoneNumber =myContacts.get(i).getPhoneNumber();
                myContacts.set(i, Contacts.createContact(newContactName,phoneNumber));
                return "Contact Name found ";

            }

        }
        return "Contact Name not found";
    }

    public String modifyPhoneNumber(String oldPhoneNumber,String newPhoneNumber)
    {
        for(int j =0 ;j <myContacts.size(); j++)
        {
            if(myContacts.get(j).getPhoneNumber() == oldPhoneNumber) {
                String contactName =myContacts.get(j).getName();
                myContacts.set(j, Contacts.createContact(contactName,newPhoneNumber));
                return "Phone Number Modified";
            }

        }
        return "Phone Number not found";
    }
}
