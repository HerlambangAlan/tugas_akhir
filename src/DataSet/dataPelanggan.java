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
public class dataPelanggan {
    private  ArrayList <Integer> kodepelanggan;
    private  ArrayList <String> namapelanggan;
    private  ArrayList <Integer> telppelanggan;
    private  ArrayList <String> alamatpelanggan;
    private  ArrayList <Integer> tanggaldaftar;
   
    
    public dataPelanggan (){
        kodepelanggan = new ArrayList <Integer>();
        namapelanggan = new ArrayList <String>();
        telppelanggan = new ArrayList <Integer>();
        alamatpelanggan = new ArrayList <String>();
         tanggaldaftar  = new ArrayList <Integer>();
       
       
    };
   
    public void insertkodepelanggan(Integer isi){
        this.kodepelanggan.add(isi);
    }
    
    public ArrayList <Integer> getRecordkodepelanggan(){
        return this.kodepelanggan;
    }
    
    public void insertnamapelanggan (String isi){
        this.namapelanggan.add(isi);
    }
    
    public ArrayList <String> getRecordnamapelanggan(){
        return this.namapelanggan;
    }
    
    public void inserttelPelanggan (Integer isi) {
        this.telppelanggan.add(isi);
    }
    public ArrayList <Integer> getRecordtelppelanggan(){
        return this.telppelanggan;
    }
    
    public void insertalamatpelanggan (String isi) {
        this.alamatpelanggan.add(isi);
    }
    
    public ArrayList <String> getRecordalamatpelanggan(){
        return this.alamatpelanggan;
    }
     public void inserttanggaldaftar (Integer isi) {
        this.tanggaldaftar.add(isi);
    }
    
    public ArrayList <Integer> getRecordtanggaldaftar(){
        return this.tanggaldaftar;
    }
            
    
}
