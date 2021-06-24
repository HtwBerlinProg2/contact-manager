package de.htwberlin;

public class Contact {


  private final String firstName;
  private final String lastName;
  private final String mobile;
  private final Address address;


  /*private final String street;
  private final String zipCode;
  private final String city;*/

  public Contact(String firstName, String lastName, String mobile, /*,String street, String zipCode, String city*/Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.address = address;
    /*this.street = street;
    this.zipCode = zipCode;
    this.city = city;*/
  }


  public Contact(String firstName, String lastName,Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = null;
    this.address = address;

  }
  public Contact(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = null;
    this.mobile = null;
  }

  public Contact(String firstName, String lastName,String mobile) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.address = null;
  }

  @Override
  public String toString() {

    if (address == null && mobile == null ){
      return   firstName +" "+ lastName + "  n/a"+ "  n/a";
    }
    else if (address == null) {
      return   firstName +" "+ lastName + mobile + "  n/a " ;
    }
    else if (mobile == null) {
      return   firstName +" "+ lastName +" n/a  "+ address ;
    }
    return   firstName +" "+ lastName +" "+ mobile +" "+ address ;
    }
}
