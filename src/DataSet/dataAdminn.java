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
public class dataAdminn {
    private  ArrayList <Integer> kodeadmin;
    private  ArrayList <String> namaadmin;
    private  ArrayList <Integer> noadmin;
    private  ArrayList <String> alamatadmin;
    private  ArrayList <String> katasandi;
    private  ArrayList <String> jabatan;
    
    public dataAdminn (){
        kodeadmin = new ArrayList <Integer>();
        namaadmin = new ArrayList <String>();
        noadmin = new ArrayList <Integer>();
        alamatadmin = new ArrayList <String>();
        katasandi = new ArrayList <String>();
        jabatan = new ArrayList <String>();
    };
   
    public void insertkodeadmin(int isi){
        this.kodeadmin.add(isi);
    }
    
    public ArrayList <Integer> getRecordkodeadmin(){
        return this.kodeadmin;
    }
    
    public void insertnamaadmin (String isi){
        this.namaadmin.add(isi);
    }
    
    public ArrayList <String> getRecordnamaadmin(){
        return this.namaadmin;
    }
    
    public void insertnoadmin (Integer isi) {
        this.noadmin.add(isi);
    }
    public ArrayList <Integer> getRecordnoadmin(){
        return this.noadmin;
    }
    
    public void insertalamatadmin (String isi) {
        this.alamatadmin.add(isi);
    }
    
    public ArrayList <String> getRecordalamatadmin(){
        return this.alamatadmin;
    }
    
    public void insertkatasandi (String isi) {
        this.katasandi.add(isi);
    }
    
    public ArrayList <String> getRecordkatasandi(){
        return this.katasandi;
    }
    
    public void insertjabatan (String isi) {
        this.jabatan.add(isi);
    }
    public ArrayList <String> getRecordjabatan(){
        return this.jabatan;
    }
           
    
}
