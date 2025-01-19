/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class luaslingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double phi = 3.14;
        String jari2 = JOptionPane.showInputDialog("Masukkan Input Jari-Jari");
        double luas = phi * (Double.parseDouble(jari2)*Double.parseDouble(jari2));
        
        System.out.println(luas);
    }
    
}
