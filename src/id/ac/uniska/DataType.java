package id.ac.uniska;

import javax.swing.*;

public class DataType {

    public static void main(String[] args) {
        String namaDepan    = "Yudhi";
        String namaTengah   = "Permana";
        String namaBelakang = "";
        int usia            = 19;
        int targetTahunKuliah = 4;
        double ipk            = 3.8;
        char nilaiAbjad       = 'A';
        boolean tampan        = true;

        System.out.println("Nama Depan :" + namaDepan);
        System.out.println("Nama Tengah :" + namaTengah);
        System.out.println("Nama Belakang :" + namaBelakang);
        System.out.println("Usia :" + usia);
        System.out.println("Target Kuliah :" + targetTahunKuliah + " tahun");
        System.out.println("IPK :" + ipk);
        System.out.println("Nilai Abjad :" + nilaiAbjad);
        System.out.println("Tampan " + tampan);

        JOptionPane.showMessageDialog(
                null, "Halo "+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}
