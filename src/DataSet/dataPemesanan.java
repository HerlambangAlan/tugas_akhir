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
public class dataPemesanan {
    private  ArrayList <Integer> kodepemesanan;
    private  ArrayList <String> ktgpemesanan;
    private  ArrayList <String> ketpemesanan;
    private  ArrayList <Integer> tglpemesanan;
    private  ArrayList <Integer> tglpengambilan;
    
    public dataPemesanan (){
        kodepemesanan = new ArrayList <Integer>();
        ktgpemesanan = new ArrayList <String>();
        ketpemesanan = new ArrayList <String>();
        tglpemesanan = new ArrayList <Integer>();
        tglpengambilan = new ArrayList <Integer>();
        
    };
   
    public void insertkodePemesanan(Integer isi){
        this.kodepemesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordkodepemesanan(){
        return this.kodepemesanan;
    }
    
    public void insertktgpemesanan (String isi){
        this.ktgpemesanan.add(isi);
    }
    
    public ArrayList <String> getRecordktgpemesanan(){
        return this.ktgpemesanan;
    }
    
    public void insertketPemesanan(String isi) {
        this.ketpemesanan.add(isi);
    }
    public ArrayList <String> getRecordketpemesanan(){
        return this.ketpemesanan;
    }
    
    public void insertglpemesanan(Integer isi) {
        this.tglpemesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordtglpemesanan(){
        return this.tglpemesanan;
    }
    
    public void inserttglpengambilan (Integer isi) {
        this.tglpengambilan.add(isi);
    }
    
    public ArrayList <Integer> getRecordtglpengambilan(){
        return this.tglpengambilan;
    }
   
         
}
