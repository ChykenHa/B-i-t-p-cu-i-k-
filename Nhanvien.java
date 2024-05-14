package com.mycompany.baitap;
public class Nhanvien extends Canbo{
    private String Congviec;

    public Nhanvien(String Name, int Age, String gender, String address, String Congviec) 
    {
        super(Name, Age, gender, address);
        this.Congviec = Congviec;
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String Congviec) {
        this.Congviec = Congviec;
    }
   
}
