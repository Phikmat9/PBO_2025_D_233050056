package pertemuan6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TranskripNilai {
    private KartuHasilStudi kartuHasilStudi;
    private Mahasiswa mahasiswa;
    private LocalDateTime tanggalCetak;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new KartuHasilStudi();
        this.tanggalCetak = LocalDateTime.now();
    }

    public void tambahMatakuliah(Matakuliah matakuliah) {
        kartuHasilStudi.tambahMatakuliah(matakuliah);
    }

    public void tampilkanTranskrip() {
        mahasiswa.tampilkanInfo();

        // Format tanggal cetak tanpa zona waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");
        System.out.println("Tanggal Cetak: " + tanggalCetak.format(formatter) + " WIB");

        System.out.println("IPK: 0.0");  // IPK masih default, bisa dihitung nanti
        kartuHasilStudi.tampilkanKHS();
    }
}


