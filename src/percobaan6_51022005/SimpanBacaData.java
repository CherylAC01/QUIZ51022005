/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan6_51022005;

import java.io.*;

public class SimpanBacaData {
    public void simpanData(String id, String nama, String Wilayah, String point, String gajiPokok, String
            bonus, String gajiTotal) {
        try {
            FileOutputStream fout = new FileOutputStream("Sales.dat", true);
            DataOutputStream out = new DataOutputStream(fout);
            out.writeUTF(id);
            out.writeUTF(nama);
            out.writeUTF(Wilayah);
            out.writeUTF(point);
            out.writeUTF(gajiPokok);
            out.writeUTF(bonus);
            out.writeUTF(gajiTotal);
            out.close();
        } catch(IOException e) {
    }
}
    public String bacaData() {
        String buf = " ";
        String bufid,bufnama,bufWilayah,bufpoint,bufgajiPokok,bufbonus,bufgajiTotal;
        String temp,data="";
        try {
            FileInputStream fin = new FileInputStream("Sales.dat");
            DataInputStream in = new DataInputStream(fin);
            while(in.available()>1) {
                bufid=in.readUTF();
                bufnama=in.readUTF();
                bufWilayah=in.readUTF();
                bufpoint=in.readUTF();
                bufgajiPokok=in.readUTF();
                bufbonus=in.readUTF();
                bufgajiTotal=in.readUTF();
                temp="id="+bufid+"|"+"Nama= "+bufnama+"|"+"Wilayah= "+bufWilayah+"|"+"Point= "+bufpoint+"|"
                        +"Gaji Pokok= "+bufgajiPokok+"|"+"Bonus= "+bufbonus+"|"+"Gaji Total= "+bufgajiTotal+
                        "|"+"\r\n";
                data+=temp;
            }
            in.close();
            } catch(IOException e) {
                System.out.println(e.toString());
            }
        return (data);
        }
    }
