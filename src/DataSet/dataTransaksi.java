/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dataTransaksi {
    private  ArrayList <Integer> nonota;
    private  ArrayList <Integer> kodepemesanan;
    private  ArrayList <Integer> totalbayar;
    private  ArrayList <Integer> uangbayar;
    private  ArrayList <Integer> uangkembali;
    private  ArrayList <Integer> tgltransaksi;
    
    public dataTransaksi (){
        nonota = new ArrayList <Integer>();
        kodepemesanan = new ArrayList <Integer>();
        totalbayar = new ArrayList <Integer>();
        uangbayar = new ArrayList <Integer>();
        uangkembali = new ArrayList <Integer>();
        tgltransaksi = new ArrayList <Integer>();
    };
   
    public void insertnonota(Integer isi){
        this.nonota.add(isi);
    }
    
    public ArrayList <Integer> getRecordnonota(){
        return this.nonota;
    }
    
    public void insertkodepemesanan(Integer isi){
        this.kodepemesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordkodepemesanan(){
        return this.kodepemesanan;
    }
    public void inserttotalbayar (Integer isi){
        this.totalbayar.add(isi);
    }
    
    public ArrayList <Integer> getRecordtotalbayar(){
        return this.totalbayar;
    }
    
    public void insertnouangbayar (Integer isi) {
        this.uangbayar.add(isi);
    }
    public ArrayList <Integer> getRecorduangbayar(){
        return this.uangbayar;
    }
    
    public void insertuangkembali (Integer isi) {
        this.uangkembali.add(isi);
    }
    
    public ArrayList <Integer> getRecorduangkembali(){
        return this.uangkembali;
    }
    
    public void inserttgltransaksi (Integer isi) {
        this.tgltransaksi.add(isi);
    }
    
    public ArrayList <Integer> getRecordtgltransaksi(){
        return this.tgltransaksi;
    }
    
    
}
