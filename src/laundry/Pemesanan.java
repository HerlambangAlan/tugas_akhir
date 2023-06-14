/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class Pemesanan {
  
    private int kodepemesanan;
    private String ktgpemesanan;
    private String ketpemesanan;
    private int tglpemesanan;
    private int tglpengambilan;
    
    public Pemesanan(){}
    
     //Method Get and Set
    public int getkodepemesanan(){
        return kodepemesanan;
    }
    public void setkodepemesanan(int kodepemesanan){
        this.kodepemesanan= kodepemesanan;
    }
    public String getktgpemesanan(){
        return ktgpemesanan;
    }
    public void setktgpemesanan(String ktgpemesanan){
        this.ktgpemesanan = ktgpemesanan;
    }
    public String getpetpemesanan(){
        return ketpemesanan;
    }
    public void setketpemesanan(String ketpemesanan){
        this.ketpemesanan= ketpemesanan;
    }
    public int gettglpemesanan(){
        return tglpemesanan;
    }
    public void settglpemesanan(int tglpemesanan){
        this.tglpemesanan = tglpemesanan;
    }
    public int gettglpengambilan(){
        return tglpengambilan;
    }
    public void settglpengambilan(int tglpengambilan){
        this.tglpengambilan = tglpengambilan;
    }
   
}
