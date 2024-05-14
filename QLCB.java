package com.mycompany.baitap;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class QLCB
{
    private ArrayList<Canbo> DanhSachCanBo;
    public QLCB()
    {
        DanhSachCanBo = new ArrayList();
    }
    public void docFile(String fileName)
    {
            try(BufferedReader br = new BufferedReader (new FileReader(fileName)))
            {
                String line;
                while ((line = br.readLine()) != null)
                    {
                            
                            String[] tokens = line.split("\t");
                            String Name = tokens[0];
                            int Age = Integer.parseInt(tokens[1]);
                            String gender= tokens[2];
                            String address = tokens[3];
            if (tokens[4].equalsIgnoreCase("CongNhan")) {
                    int Capbac = Integer.parseInt(tokens[5]);
                    DanhSachCanBo.add(new Congnhan(Name, Age, gender, address, Capbac));
                } else if (tokens[4].equalsIgnoreCase("KySu")) {
                    String Nganhdaotao = tokens[5];
                    DanhSachCanBo.add(new KySu(Name, Age, gender, address, Nganhdaotao));
                } else if (tokens[4].equalsIgnoreCase("NhanVien")) {
                    String Congviec = tokens[5];
                    DanhSachCanBo.add(new Nhanvien(Name, Age, gender, address, Congviec));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
