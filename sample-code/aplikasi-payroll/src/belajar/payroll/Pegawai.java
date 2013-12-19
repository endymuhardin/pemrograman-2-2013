package belajar.payroll;

import java.math.BigDecimal;

public class Pegawai{
    private String nomer;
    private String nama;
    private BigDecimal gaji;
    private BigDecimal denda;
    private BigDecimal lembur;
    private BigDecimal transport;
    
    public String getNomer(){
        return nomer;
    }
    
    public void setNomer(String x){
        nomer = x;
    }
    
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String x){
        nama = x;
    }
    
    public BigDecimal getGaji(){
        return gaji;
    }
    
    public void setGaji(BigDecimal x){
        gaji = x;
    }
    
    public BigDecimal getDenda(){
        return denda;
    }
    
    public void setDenda(BigDecimal x){
        denda = x;
    }
    
    public BigDecimal getLembur(){
        return lembur;
    }
    
    public void setLembur(BigDecimal x){
        lembur = x;
    }
    
    public BigDecimal getTransport(){
        return transport;
    }
    
    public void setTransport(BigDecimal x){
        transport = x;
    }
}
