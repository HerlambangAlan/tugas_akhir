/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class Pelanggan {
  
    private int kodepelanggan;
    private String namapelanggan;
    private int telppelanggan;
    private String alamatpelanggan;
    private int tanggaldaftar;
    
    public Pelanggan(){}
    
     //Method Get and Set
    public int getkodepelanggan(){
        return kodepelanggan;
    }
    public void setkodepelanggan(int kodepelanggan){
        this.kodepelanggan= kodepelanggan;
    }
    public String getnamapelanggan(){
        return namapelanggan;
    }
    public void setnamapelanggan(String namapelanggan){
        this.namapelanggan = namapelanggan;
    }
    public int gettelppelanggan(){
        return telppelanggan;
    }
    public void settelppelanggan(int telppelanggan){
        this.telppelanggan = telppelanggan;
    }
    public String getalamatpelanggan(){
        return alamatpelanggan;
    }
    public void setalamatpelanggan(String alamatpelanggan){
        this.alamatpelanggan= alamatpelanggan;
    }
    public int gettanggaldaftar(){
        return tanggaldaftar;
    }
    public void settanggaldaftar(int tanggaldaftar){
        this.tanggaldaftar = tanggaldaftar;
    }
}
