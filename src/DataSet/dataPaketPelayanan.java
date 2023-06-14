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
public class dataPaketPelayanan {
    private  ArrayList <Integer> idpaket;
    private  ArrayList <String> namapaket;
    private  ArrayList <String> kategoripaket;
    private  ArrayList <String> jenispaket;
    private  ArrayList <Integer> hargapaket;
    
    public dataPaketPelayanan (){
        idpaket = new ArrayList<Integer>();
        namapaket = new ArrayList<String>();
        kategoripaket = new ArrayList<String>();
        jenispaket = new ArrayList<String>();
        hargapaket = new ArrayList<Integer>();
      
    };
   
    public void insertidpaket(Integer isi){
        this.idpaket.add(isi);
    }
    
    public ArrayList <Integer> getRecordidpaket(){
        return this.idpaket;
    }
    
    public void insertnamapaket (String isi){
        this.namapaket.add(isi);
    }
    
    public ArrayList <String> getRecordnamapaket(){
        return this.namapaket;
    }
    public void insertkategoripaket (String isi) {
        this.kategoripaket.add(isi);
    }
    public ArrayList <String> getRecordkategoripaket(){
        return this.kategoripaket;
    }
    
    public void insertjenispaket (String isi) {
        this.jenispaket.add(isi);
    }
    
    public ArrayList <String> getRecordjenispaket(){
        return this.jenispaket;
    }
    
    public void inserthargapaket (Integer isi) {
        this.hargapaket.add(isi);
    }
    
    public ArrayList <Integer> getRecordhargapaket(){
        return this.hargapaket;
    }
 
    
}
