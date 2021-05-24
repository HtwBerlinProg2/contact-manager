package de.htwberlin;

public class App {

  public static void main(String[] args) {


      Person Alice = new Person();
      Alice.Addinfo("Alice ", new Contact("Megan", "Gilmore"));
      Alice.Addinfo("Alice ", new Contact("Harry", "Fisher ", "+491253490723"));
      Alice.showContacts();


      Person Bob = new Person();
      Bob.Addinfo("Bob", new Contact("Robert", "White", new Address("Warschauer Str. 1", "12345", "Berlin")));
      Bob.Addinfo("Bob",(new Contact("Mary", "Stuart", "+491239730943", new Address("Warschauer Str. 2", "12345", "Berlin"))));
      Bob.Addinfo("Bob",(new Contact("Bobby", "Martinez")));
      Bob.showContacts();

      // Contacts of Alice
    //  ContactBook.addContact(new Contact("Megan", "Gilmore"));
      //ContactBook.addContact(new Contact("Harry", "Fisher", "+491253490723"));

    // Contacts of Bob
      //ContactBook.addContact(new Contact("Robert", "White", new Address("Warschauer Str. 1", "12345", "Berlin")));
      //ContactBook.addContact(new Contact("Mary", "Stuart", "+491239730943", new Address("Warschauer Str. 2", "12345", "Berlin")));
      //ContactBook.addContact(new Contact("Bobby", "Martinez"));

    //ContactBook.showContacts();
  }
}
