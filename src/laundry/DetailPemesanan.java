/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class DetailPemesanan {
    
    private int iddetail;
    private int kodepemesanan;
    private int idpaket;
    private int jumlah;
    private int berat;
    private int subtotal;
    
    public DetailPemesanan(){}
    
    //Method Get and Set
    public int getIddetail(){
        return iddetail;
    }
    public void setIddetail(int iddetail){
        this.iddetail = iddetail;
    }
    public int getkodepemesanan(){
        return kodepemesanan;
    }
    public void setkodepemesanan(int kodepemesanan){
        this.kodepemesanan = kodepemesanan;
    }
    public int getidpaket(){
        return idpaket;
    }
    public void setidpaket(int idpaket){
        this.idpaket = idpaket;
    }
    public int getjumlah(){
        return jumlah;
    }
    public void setjumlah(int jumlah){
        this.jumlah= jumlah;
    }
    public int getberat(){
        return berat;
    }
    public void setberat(int berat){
        this.berat = berat;
    }
    public int getsubtotal(){
        return subtotal;
    }
    public void setsubtotal(int subtotal){
        this.subtotal = subtotal;
    }
   
}
