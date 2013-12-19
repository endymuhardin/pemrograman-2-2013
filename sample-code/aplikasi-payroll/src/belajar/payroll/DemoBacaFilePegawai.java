package belajar.payroll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class DemoBacaFilePegawai {
    public static void main(String[] xx) throws Exception {
        // file yang akan dibaca
        FileReader tarifCsv = new FileReader("data"+ File.separator +"tarif.csv");
        
        // setelah dibaca dan diproses, simpan di variabel daftarPegawai
        List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        
        // Bungkus dengan BufferedReader, supaya bisa baca baris per baris
        BufferedReader reader = new BufferedReader(tarifCsv);
        
        // baca file per baris, kemudian konversi menjadi object Pegawai
        String data = reader.readLine(); // baca baris pertama dan abaikan (header)
        while((data = reader.readLine()) != null){
            String[] baris = data.split(","); // pisahkan data dengan separator koma
            
            // object Pegawai
            Pegawai p = new Pegawai();
            p.setNomer(baris[0]); // index 0 : nomer pegawai
            p.setNama(baris[1]); // index 1 : nama pegawai
            p.setGaji(new BigDecimal(baris[2])); // index 2 : gaji pokok, konversi menjadi BigDecimal
            p.setDenda(new BigDecimal(baris[3])); // index 3 : denda telat, konversi menjadi BigDecimal
            p.setLembur(new BigDecimal(baris[4])); // index 4 : uang lembur, konversi menjadi BigDecimal
            p.setTransport(new BigDecimal(baris[5])); // index 5 : uang transport, konversi menjadi BigDecimal
            
            // masukkan ke variabel daftarPegawai
            daftarPegawai.add(p);
        }
        
        // setelah file selesai dibaca, jangan lupa ditutup supaya bisa digunakan aplikasi lain
        reader.close();
        
        // tampilkan isi daftar pegawai
        for(Pegawai px : daftarPegawai){
            System.out.println("========================");
            System.out.println("Nomer : "+px.getNomer());
            System.out.println("Nama : "+px.getNama());
            System.out.println("Gaji : "+px.getGaji());
            System.out.println("Denda : "+px.getDenda());
            System.out.println("Lembur : "+px.getLembur());
            System.out.println("Transport : "+px.getTransport());
        }
    }
}
