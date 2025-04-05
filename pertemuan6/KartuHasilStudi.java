package pertemuan6;

import java.util.ArrayList;

public class KartuHasilStudi {
    private ArrayList<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi() {
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void tambahMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public void tampilkanKHS() {
        for (Matakuliah mk : daftarMatakuliah) {
            mk.tampilkanInfo();
        }
    }
}
