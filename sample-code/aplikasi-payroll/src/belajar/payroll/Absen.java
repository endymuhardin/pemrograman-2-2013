package belajar.payroll;

import java.util.Date;

public class Absen {
    private Pegawai pegawai;
    private Date datang;
    private Date pulang;
    
    public Pegawai getPegawai(){
        return pegawai;
    }
    
    public void setPegawai(Pegawai x){
        pegawai = x;
    }
    
    public Date getDatang(){
        return datang;
    }
    
    public void setDatang(Date x){
        datang = x;
    }
    
    public Date getPulang(){
        return pulang;
    }
    
    public void setPulang(Date x){
        pulang = x;
    }
}
