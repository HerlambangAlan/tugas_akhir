/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author ASUS
 */
public class Adminn {
    private int kodeadmin;
    private String namaadmin;
    private int noadmin;
    private String alamatadmin;
    private String katasandi;
    private String jabatan;
    
    public Adminn(){}
    
    //Method Get and Set
    public int kodeadmin(){
        return kodeadmin;
    }
    public void setkodeadmin(int kodeadmin){
        this.kodeadmin = kodeadmin;
    }
    public String getnamaadmin(){
        return namaadmin;
    }
    public void setnamaadmin(String namaadmin){
        this.namaadmin = namaadmin;
    }
    public int getnoadmin(){
        return noadmin;
    }
    public void setnoadmin(int noadmin){
        this.noadmin = noadmin;
    }
    public String getalamatadmin(){
        return alamatadmin;
    }
    public void setalamatadmin(String alamatadmin){
        this.alamatadmin = alamatadmin;
    }
    public String getkatasandi(){
        return katasandi;
    }
    public void setkatasandi(String katasandi){
        this.katasandi = katasandi;
    }
    public String getjabatan(){
        return jabatan;
    }
    public void setjabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    
}


