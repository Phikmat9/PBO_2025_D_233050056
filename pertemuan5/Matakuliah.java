package pertemuan5;

import java.util.ArrayList;

public class Matakuliah {
    private String kode;
    private String nama;

    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Matakuliah: " + kode);
        System.out.println("Nama Matakuliah: " + nama);
    }
}
