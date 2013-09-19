package p2.sesi2;

public class Demo {
    public static void main(String[] x){
        Mahasiswa m = new Mahasiswa();
        m.setNpm("12345");
        m.setNama("Endy");

        System.out.println("NPM : "+m.getNpm());
        System.out.println("Nama : "+m.getNama());
    }
}
