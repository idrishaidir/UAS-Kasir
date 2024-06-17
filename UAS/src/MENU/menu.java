package MENU;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliid
 */
public class menu {
    public String pilihMenu, pilihSize, pilihdonasi,pembayaran;
    public double a=0,jumlahBeli = 0,hargaSize=0,donasi=0,diskon = 0,totalHarga=0,total=0, ppn=0, bayar=0;
    
    public void setPilihMenu(String val){
        this.pilihMenu = val;
    }
    
    public String getPilihMenu(){
        return pilihMenu;
    }
    
    public void setPilihSize(String val){
        this.pilihSize = val;
    }
    public String getPilihSize(){
        return pilihSize;
    }
    
    public void setPilihPembayaran(String val){
        this.pembayaran = val;
    }
    
    public double getDiskon(){
        return diskon;
    }
    
    public double getHarga(){
        return hargaSize;
    }
    
    public double setSeleksiDiskon(){
        if(pembayaran.equalsIgnoreCase("Dana")){
            diskon = 0.1*getTotalSementara();
        }else{
            diskon = 0;
        }
        return diskon;
    }
    
    
    public double getPPN(){
        ppn = 0.11*getTotalSementara();
        return ppn;
    }
    public void setTotal(double val){
        total = val;
    }
    
    public double getTotal(){
        total = donasi+getTotalSementara()-diskon+ppn;
        return total;
    }
    

    public double getHargaMenu() {
        return jumlahBeli;
    }

    public void setHargaMenu(double jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    
    public double getTotalSementara() {
        return (jumlahBeli*hargaSize);
    }
    
    
    public double getDonasi(){
        return donasi;
    }
   
    
    public void setDonasi(double donasi){
        this.donasi = donasi;
    }
    
    public double getBayar(){
        return bayar;
    }
    
    public void setBayar(double bayar){
        this.bayar = bayar;
    }
    
    public void setHapus(){
        hargaSize = 0;
        donasi = 0;
        jumlahBeli = 0;
        diskon = 0;
        bayar = 0;
    }
    
    public double getTotalBayar(){
        return bayar-getTotal();
    }
    public double setSeleksiMenu() {
        return hargaSize;
    }
}
