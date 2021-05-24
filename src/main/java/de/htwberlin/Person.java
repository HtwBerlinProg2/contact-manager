package de.htwberlin;

import java.util.ArrayList;

public class Person {

    private String owner;
    private ContactBook contactBook;
    private Contact contact;
    private static int lastIndex = -1;
    private static final Contact[] contacts = new Contact[20];

public Person() {

    }

    public void addInfo(String owner, Contact contact) {
        this.owner = owner;
        this.contact = contact;
        int newIndex = lastIndex + 1;
        if (newIndex >= contacts.length) {
            throw new RuntimeException("The contact book has no further capacity!");
        }
        contacts[newIndex] = contact;
        lastIndex = newIndex;
    }


    public Contact getContact() {
        return contact;
    }

    public String getOwner() {
        return owner;
    }

    public ContactBook getContactBook() {
        return contactBook;
    }

            public void showContacts() {
            System.out.println("these are the contact of "+ owner);
                for (Contact contact : contacts) {
                    if (contact != null) {
                        System.out.println(contact.toString());
                    }
                }
                System.out.println("\n");

           }

}
