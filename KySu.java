package com.mycompany.baitap;
public class KySu extends Canbo
{
    private String Nganhdaotao;

    public KySu(String Name, int Age, String gender, String address, String Nganhdaotao) 
    {
        super(Name, Age, gender, address);
        this.Nganhdaotao = Nganhdaotao;
    }

    public String getNganhdaotao() {
        return Nganhdaotao;
    }

    public void setNganhdaotao(String Nganhdaotao) {
        this.Nganhdaotao = Nganhdaotao;
    }
    
}
