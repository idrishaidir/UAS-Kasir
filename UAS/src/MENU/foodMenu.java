/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENU;

/**
 *
 * @author aliid
 */
public class foodMenu extends menu{
    @Override
    public double setSeleksiMenu(){
        if(pilihMenu.equalsIgnoreCase("burger")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 45_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 35_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize= 20_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Coffe")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 75_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 50_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 25_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Juice")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 50_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 30_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 15_000;
            }else{
                hargaSize =0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Fried Chicken")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 20_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 15_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 10_000;
            }else{
                hargaSize=0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Fried Fries")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 20_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 15_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 10_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Pizza")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 200_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 150_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 130_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Mie")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 65_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 40_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 25_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Nasi")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 15_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 10_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 5_000;
            }else{
                hargaSize = 0;
            }
        }else if(pilihMenu.equalsIgnoreCase("Soda")){
            if(pilihSize.equalsIgnoreCase("Large")){
                hargaSize = 30_000;
            }else if(pilihSize.equalsIgnoreCase("Medium")){
                hargaSize = 20_000;
            }else if(pilihSize.equalsIgnoreCase("Small")){
                hargaSize = 15_000;
            }else{
                hargaSize = 0;
            }
        }
        return hargaSize;
    }
    private void setHargaSize(double harga) {
        super.hargaSize = harga;
    }
}
