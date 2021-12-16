package ru.geekbrains.homework1;

import java.util.Date;

public class Person {
    String name;
    String lastName;
    String email;
    String phone;
    String pass;
    String grass;
    long birtday;

    public  Person(String name,String lastName,String email,String phone,String pass,long birtday){
         this.name = name;
         this.lastName = lastName;
         this.email = email;
         this.phone=phone;
         this.pass = pass;
         this.birtday = birtday;
    }
    public Person(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getBirtday() {
        return birtday;
    }

    public void setBirtday(long birtday) {
        this.birtday = birtday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", pass='" + pass + '\'' +
                ", birtday=" + birtday +
                '}';
    }

}
