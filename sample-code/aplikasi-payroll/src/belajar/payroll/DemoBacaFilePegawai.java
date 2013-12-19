package belajar.payroll;

import java.io.File;
import java.util.List;

public class DemoBacaFilePegawai {
    public static void main(String[] xx) throws Exception {
    
        PegawaiDao pd = new PegawaiDao("data"+ File.separator +"tarif.csv");
        List<Pegawai> daftarPegawai = pd.semuaPegawai();
        
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
