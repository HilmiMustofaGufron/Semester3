/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1Dimensi;

/**
 *
 * @author Huawei
 */
import java.util.Scanner;

public class Nilaiterkecil {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("|   Program Java Cari Nilai Terkecil   |");
        System.out.println("========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, min_num;

        System.out.print("Input jumlah element array: ");
        arr_count = input.nextInt();

        System.out.println("Input " + arr_count + " angka (pisah angka dengan klik enter):");

        for (i = 0; i < arr_count; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        min_num = arr[0];
        for (i = 0; i < arr_count; i++) {
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
        }

        System.out.println("Angka terkecil dari nilai diatas adalah: " + min_num);

    }
}
