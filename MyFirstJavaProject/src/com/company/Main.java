package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactsManager myContactsManager = new ContactsManager();
        Contact friendAmir = new Contact();
        friendAmir.name="Amir";
        friendAmir.phoneNumber="+923314017565";
        myContactsManager.addContact(friendAmir);

        Contact friendAleem = new Contact();
        friendAleem.name="Aleem";
        friendAleem.phoneNumber="+923015198786";
        myContactsManager.addContact(friendAleem);

        Contact friendABC = new Contact();
        friendABC.name="ABC";
        friendABC.phoneNumber="+900078601";
        myContactsManager.addContact(friendABC);

        Contact result = myContactsManager.searchContact(friendABC.name);

        //System.out.println("Contact Phone Number"+result.phoneNumber);
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }
    }
}
