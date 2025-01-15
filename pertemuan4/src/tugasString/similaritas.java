/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasString;

/**
 *
 * @author Huawei
 */
import java.util.HashSet;
import java.util.Set;

public class similaritas {

    public static double hitungSimilaritasJaccard(String kata1, String kata2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : kata1.toCharArray()) {
            set1.add(c);
        }
        for (char c : kata2.toCharArray()) {
            set2.add(c);
        }

        Set<Character> irisan = new HashSet<>(set1);
        irisan.retainAll(set2);

        Set<Character> gabungan = new HashSet<>(set1);
        gabungan.addAll(set2);

        double similaritas = (double) irisan.size() / gabungan.size();
        return similaritas;
    }

    public static void main(String[] args) {
        String kata1 = "kiw kiw";
        String kata2 = "wow wow";

        double similaritas = hitungSimilaritasJaccard(kata1, kata2);
        System.out.println("Similaritas Jaccard antara '" + kata1 + "' dan '" + kata2 + "': " + similaritas);
    }
}
