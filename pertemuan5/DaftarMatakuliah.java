package pertemuan5;

import java.util.ArrayList;

public class DaftarMatakuliah {
    private ArrayList<Matakuliah> daftarMatakuliah;

    public DaftarMatakuliah() {
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.add(mk);
    }

    public void tampilkanDaftar() {
        System.out.println("Daftar Mata Kuliah yang Tersedia:");
        for (Matakuliah mk : daftarMatakuliah) {
            mk.tampilkanInfo();
            System.out.println();
        }
    }

    public Matakuliah getMatakuliah(int index) {
        if (index >= 0 && index < daftarMatakuliah.size()) {
            return daftarMatakuliah.get(index);
        }
        return null;
    }
}

