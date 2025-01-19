/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Huawei
 */
public class LuasLingkaranStruktural {
    public static void main(String[] args) {
        //variable luas lingkaran
        double phi = 3.14;
        double jari2 = 10;
        
        //variable luas persegi panjang
        double lebar = 10;
        double panjang = 20;
        
        //hitungan luas lingkaran
        double luasL = phi * (jari2 * jari2);
        
        //hitungan luas persegi panjang
        double luasP = panjang * lebar;
        
        System.out.println("Luas Lingkaran = " + luasL);
        System.out.println("Luas Persegi panjang = " + luasP);
    }
}
