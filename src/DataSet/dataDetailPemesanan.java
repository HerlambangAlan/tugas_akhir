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
public class dataDetailPemesanan {
    private  ArrayList <Integer> iddetail;
    private  ArrayList <Integer> kodepesanan;
    private  ArrayList <Integer> idpaket;
    private  ArrayList <Integer> jumlah;
    private  ArrayList <Integer> berat;
    private  ArrayList <Integer> subtotal;
    public dataDetailPemesanan (){
        iddetail = new ArrayList <Integer>();
        kodepesanan = new ArrayList <Integer>();
        idpaket = new ArrayList <Integer>();
        jumlah = new ArrayList <Integer>();
        berat = new ArrayList <Integer>();
        subtotal= new ArrayList <Integer>();
    };
   
    public void insertiddetail(Integer isi){
        this.iddetail.add(isi);
    }
    
    public ArrayList <Integer> getRecordiddetail(){
        return this.iddetail;
    }
    
    public void insertkodepesanan (Integer isi){
        this.kodepesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordkodepesanan(){
        return this.kodepesanan;
    }
    
    public void insertidpaket (Integer isi) {
        this.idpaket.add(isi);
    }
    public ArrayList <Integer> getRecordidpaket(){
        return this.idpaket;
    }
    
    public void insertjumlah (Integer isi) {
        this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getRecordjumlah(){
        return this.jumlah;
    }
    
    public void insertberat (Integer isi) {
        this.berat.add(isi);
    }
    
    public ArrayList <Integer> getRecordberat(){
        return this.berat;
    }
    
    public void insertsubtotal (Integer isi) {
        this.subtotal.add(isi);
    }
    public ArrayList <Integer> getRecordsubtotal(){
        return this.subtotal;
    }
        
    
}
