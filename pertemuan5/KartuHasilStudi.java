package pertemuan5;

public class KartuHasilStudi {
    private DaftarMatakuliah daftarMatakuliah;

    public KartuHasilStudi() {
        this.daftarMatakuliah = new DaftarMatakuliah();
    }

    public void tambahMatakuliah(Matakuliah mk) {
        daftarMatakuliah.tambahMatakuliah(mk);
    }

    public void tampilkanKHS() {
        daftarMatakuliah.tampilkanDaftar();
    }
}

