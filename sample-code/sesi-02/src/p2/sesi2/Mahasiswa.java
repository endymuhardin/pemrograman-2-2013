package p2.sesi2;

import java.util.List;

public class Mahasiswa {
    private String npm;
    private String nama;

    private List<Hasil> daftarHasilKuliah;

    // getter dan setter
    public void setNpm(String x){
        npm = x;
    }

    public String getNpm(){
        return npm;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }
}
