/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class PaketPelayanan {
    
    private int idpaket;
    private String namapaket;
    private String kategoripaket;
    private String jenispaket;
    private int hargapaket;
    
    public PaketPelayanan(){}
    
    //Method Get and Set
    public int getidpaket(){
        return idpaket;
    }
    public void setidpaket(int idpaket){
        this.idpaket = idpaket;
    }
    public String getnamapaket(){
        return namapaket;
    }
    public void setpamapaket(String namapaket){
        this.namapaket = namapaket;
    }
    public String getkategoripaket(){
        return kategoripaket;
    }
    public void setkategoripaket(String kategoripaket){
        this.kategoripaket = kategoripaket;
    }
    public String getpenispaket(){
        return jenispaket;
    }
    public void setJenispaket(String jenispaket){
        this.jenispaket = jenispaket;
    }
    public int gethargapaket(){
        return hargapaket;
    }
    public void sethargaPaket(int hargapaket){
        this.hargapaket = hargapaket;
    }
  
    
}
