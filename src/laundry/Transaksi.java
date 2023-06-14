/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class Transaksi {
   
    private int nonota;
    private int kodepemesanan;
    private int totalbayar;
    private int uangbayar;
    private int uangkembali;
    private int tgltransaksi;
    
    public Transaksi(){}
    
     //Method Get and Set
    public int getnonota(){
        return nonota;
    }
    public void setnonota(int nonota){
        this.nonota=  nonota;
    }
    public int getkodepemesanan(){
        return kodepemesanan;
    }
    public void setkodepemesanan(int kodepemesanan){
        this.kodepemesanan = kodepemesanan;
    }
    public int gettotalbayar(){
        return totalbayar;
    }
    public void settotalbayar(int totalbayar){
        this.totalbayar = totalbayar;
    }
    public int getuangbayar(){
        return uangbayar;
    }
    public void setuangbayar(int uangbayar){
        this.uangbayar= uangbayar;
    }
    public int getuangkembali(){
        return uangkembali;
    }
    public void setuangKembali(int uangkembali){
        this.uangkembali = uangkembali;
    }
    public int gettgltransaksi(){
        return tgltransaksi;
    }
    public void settgltransaksi(int tgltransaksi){
        this.tgltransaksi = tgltransaksi;
    }
}
