package belajar.payroll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DemoBacaFileAbsen {
    public static void main(String[] xx) throws Exception {
        // file yang akan dibaca
        FileReader absenCsv = new FileReader("data"+ File.separator +"absen-12.csv");
        
        // setelah dibaca dan diproses, simpan di variabel daftarAbsen
        List<Absen> daftarAbsen = new ArrayList<Absen>();
        
        // Bungkus dengan BufferedReader, supaya bisa baca baris per baris
        BufferedReader reader = new BufferedReader(absenCsv);
        
        // parser untuk konversi dari String menjadi Date (berisi tanggal + waktu)
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        // baca file per baris, kemudian konversi menjadi object Absen
        String data = reader.readLine(); // baca baris pertama dan abaikan (header)
        while((data = reader.readLine()) != null){
            String[] baris = data.split(","); // pisahkan data dengan separator koma
            
            String nomer = baris[0]; // nomer pegawai
            String tanggal = baris[1]; // tanggal, format : yyyy-MM-dd
            String jamDatang = baris[2]; // jam datang, format : HH:mm
            String jamPulang = baris[3]; // jam datang, format : HH:mm
            
            
            
            // object Absen
            Absen a = new Absen();
            Pegawai p = new Pegawai();
            p.setNomer(nomer);
            a.setPegawai(p);
            
            a.setDatang(parser.parse(tanggal + " " +jamDatang));
            a.setPulang(parser.parse(tanggal + " " +jamPulang));
            
            // masukkan ke variabel daftarPegawai
            daftarAbsen.add(a);
        }
        
        // setelah file selesai dibaca, jangan lupa ditutup supaya bisa digunakan aplikasi lain
        reader.close();
        
        // tampilkan isi daftar pegawai
        for(Absen px : daftarAbsen){
            System.out.println("========================");
            System.out.println("Nomer Pegawai: "+px.getPegawai().getNomer());
            System.out.println("Jam Datang: "+px.getDatang());
            System.out.println("Jam Pulang: "+px.getPulang());
        }
    }
}
