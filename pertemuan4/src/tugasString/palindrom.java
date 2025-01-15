/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasString;

/**
 *
 * @author Huawei
 */
public class palindrom {

    public static boolean isPalindrome(String kata) {
        kata = kata.toLowerCase().replaceAll("\\s+", "");

        int i = 0;
        int j = kata.length() - 1;
        while (i < j) {
            if (kata.charAt(i) != kata.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String kata = "katak";

        if (isPalindrome(kata)) {
            System.out.println("'" + kata + "' adalah palindrom.");
        } else {
            System.out.println("'" + kata + "' bukan palindrom.");
        }
    }
}
