package com.mycompany.baitap;
public class Canbo 
{
    private String Name;
    private int Age;
    private String gender;
    private String address;
    public Canbo() {
    }
    public Canbo(String Name, int Age, String gender, String address) 
    {
        this.Name = Name;
        this.Age = Age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
