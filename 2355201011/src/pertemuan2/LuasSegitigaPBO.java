/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Huawei
 */
public class LuasSegitigaPBO {
    MasterClass master = new MasterClass();
    
    double hasil = 0.5 * master.alas * master.tinggi;
    
    public static void main(String[] args) {
        LuasSegitigaPBO B = new LuasSegitigaPBO();
        System.out.println(B.hasil);
    }
}
