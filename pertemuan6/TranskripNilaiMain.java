package pertemuan6;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("303040001", "Jhon");

        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        TranskripNilai transkrip = new TranskripNilai(mahasiswa);
        transkrip.tambahMatakuliah(mk1);
        transkrip.tambahMatakuliah(mk2);
        transkrip.tambahMatakuliah(mk3);

        transkrip.tampilkanTranskrip();
    }
}
