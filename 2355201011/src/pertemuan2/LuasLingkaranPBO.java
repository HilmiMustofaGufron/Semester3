/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Huawei
 */
public class LuasLingkaranPBO {
    MasterClass master = new MasterClass();
    
    double hasil = master.phi * (master.jari2 * master.jari2);
    
    public static void main(String[] args) {
        LuasLingkaranPBO A = new LuasLingkaranPBO();
        System.out.println(A.hasil);
    }
}
