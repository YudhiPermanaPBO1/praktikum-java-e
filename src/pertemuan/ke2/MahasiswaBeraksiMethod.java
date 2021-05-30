package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {

    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
        mhs2.npm = "19630301";
        mhs2.nama = "Yudhi Permana";
        mhs2.tanggalLahir = formatTanggal.parse("10-08-2000");

        mhs2.tampilkanIdentitasdiri();

        System.out.println("Usia "+mhs2.nama+" adalah "+mhs2.hitungUsia()+" tahun");

        System.out.println(mhs2.hitungKali(7, 9));

        mhs2.sapaNama("Yudhi Permana");
    }
}
