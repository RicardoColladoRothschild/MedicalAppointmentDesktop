package Model;
import javax.swing.*;
public abstract class User {



    private int id;

    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    /*In the future, take this method and create a loop, giving the option to continue and save null to the phone Number
    * or to provide a correct phone number. */
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()!=10){
            JOptionPane.showMessageDialog(null, "The telephone number must contain 10 extact \n"
                                                                        +" characters, otherwise nothing will be save.");
        }else{
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " | email: " + this.getEmail();
    }

}
