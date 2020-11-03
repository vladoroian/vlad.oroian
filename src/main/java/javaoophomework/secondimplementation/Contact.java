package javaoophomework.secondimplementation;

import java.util.ArrayList;

public class Contact {

    private int no;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public Contact (int no, String phoneNumber, String firstName, String lastName){

        this.no=no;
        this.phoneNumber=phoneNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Contact () {};

    public String getPhoneNumber () { return phoneNumber; }
    public String getFirstName () { return firstName; }
    public String getLastName () { return lastName; }

    public void setNo (int no) { this.no = no;}
    public void setPhoneNumber (String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setFirstName (String firstName) {this.firstName = firstName;}
    public void setLastName (String lastName) {this.lastName = lastName;}

    public String toString (){

        return "No.= " + no + " Number = " + phoneNumber + ", first name = " + firstName + ", last name = " + lastName;
    }
}
