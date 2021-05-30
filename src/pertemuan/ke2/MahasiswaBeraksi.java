package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
       Mahasiswa mhs = new Mahasiswa();
       SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

       mhs.npm = "19630201";
       mhs.nama = "Yudhi Per";
       mhs.tanggalLahir = formatTanggal.parse("17-01-1994");

        System.out.println("NPM "+mhs.npm);
        System.out.println("Nama "+mhs.nama);
        System.out.println("Tanggal Lahir "+formatTanggal.format(mhs.tanggalLahir));

        System.out.println("#######################################################");
    }
}
