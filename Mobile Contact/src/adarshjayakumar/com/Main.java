package adarshjayakumar.com;

public class Main {

    public static void main(String[] args) {
        Contacts myContacts1 = new Contacts("Adarsh Jayakumar","1478945674");
        Contacts myContacts2 = new Contacts("Jayalatha","1375745603");
        Contacts myContacts3 = new Contacts("Jayakumar","1753567043");
        Contacts myContacts4= new Contacts("Abhinav","1258453458");
        Contacts myContacts5 = new Contacts("Jacqui","1235678990");
        MobilePhone myMobile = new MobilePhone();
        myMobile.addContact(myContacts1);
        myMobile.addContact(myContacts2);
        myMobile.addContact(myContacts3);
        myMobile.addContact(myContacts4);
        myMobile.addContact(myContacts5);
        myMobile.printContact();
        myMobile.modifyContactName("Adarsh Jayakumar","Adarsh J");
        myMobile.printContact();
        myMobile.modifyPhoneNumber("8155936714","9790878794");
        myMobile.printContact();
        myMobile.removeContact("Adarsh J");
        myMobile.printContact();





    }
}
