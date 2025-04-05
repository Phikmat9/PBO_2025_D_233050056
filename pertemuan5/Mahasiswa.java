package pertemuan5;
public class Mahasiswa {
    private String nrp;
    private String nama;
    
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }
    public String getNrp() {
        return nrp;
    }
    
    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nrp: " + nrp);
        System.out.println("Nama: " + nama);
    }
}