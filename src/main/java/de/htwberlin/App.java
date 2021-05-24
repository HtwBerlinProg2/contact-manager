package de.htwberlin;

public class App {

  public static void main(String[] args) {


      // Contacts of Alice
      ContactBook.addContact(new Contact("Megan", "Gilmore"));
      ContactBook.addContact(new Contact("Harry", "Fisher", "+491253490723"));

    // Contacts of Bob
      ContactBook.addContact(new Contact("Robert", "White", new Address("Warschauer Str. 1", "12345", "Berlin")));
      ContactBook.addContact(new Contact("Mary", "Stuart", "+491239730943", new Address("Warschauer Str. 2", "12345", "Berlin")));
      ContactBook.addContact(new Contact("Bobby", "Martinez"));

   // ContactBook.showContacts();
  }
}
