/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author Huawei
 */
public class switchcase {

    public static void main(String[] args) {
        int harike = 3;
        String day;

        day = switch (harike) {
            case 1 -> "Minggu";
            case 2 -> "Senin";
            case 3 -> "Selasa";
            case 4 -> "Rabu";
            case 5 -> "Kamis";
            case 6 -> "Jum'at";
            case 7 -> "Sabtu";
            default -> "Hari Tidak Valid";
        };

        System.out.println("Hari : " + day);
    }
}
