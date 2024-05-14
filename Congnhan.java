package com.mycompany.baitap;
public class Congnhan extends Canbo
{
    private int Capbac;

    public Congnhan(String Name, int Age, String gender, String address, int Capbac ) 
    {
        super(Name, Age, gender, address);
        this.Capbac = Capbac;
    }

    public int getCapbac() {
        return Capbac;
    }

    public void setCapbac(int Capbac) {
        this.Capbac = Capbac;
    }
    
}
