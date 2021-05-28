package id.ac.uniska;

import java.util.Locale;

public class BelajarString {

    public static void main(String[] args) {
       char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
       String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        //####################################################

        String namaDepan    = "Yudhi";
        String namaTengah   = "Permana";
        String namaBelakang = "";
        int usia            = 19;
        int targetTahunKuliah = 4;
        double ipk            = 3.8;
        char nilaiAbjad       = 'A';
        boolean tampan        = true;

        String namaLengkap = namaDepan + " "+ namaTengah+ " "+ namaBelakang;

        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5, 12));
        System.out.println(namaLengkap.replace("Yudhi", "Akbar"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
    }
}
