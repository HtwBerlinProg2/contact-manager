package de.htwberlin;

public class ContactBook {
  private static int lastIndex = -1;
  private static final Contact[] contacts = new Contact[20];


  public static void addContact(Contact contact) {

    int newIndex = lastIndex + 1;
    if (newIndex >= contacts.length) {
      throw new RuntimeException("The contact book has no further capacity!");
    }
    contacts[newIndex] = contact;
    lastIndex = newIndex;
  }



  public static void showContacts() {
    for (Contact contact : contacts) {
      if (contact != null) {
        System.out.println(contact.toString());
      }
    }
  }



}
