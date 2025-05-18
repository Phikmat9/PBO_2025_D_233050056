package tugas;

// Kelas abstrak Kendaraan mewakili kendaraan umum
// Memiliki atribut nama dan method abstrak bergerak()
public abstract class Kendaraan {
    protected String nama; // Nama kendaraan (contoh: "Toyota", "Yamaha")

    // Konstruktor untuk inisialisasi nama kendaraan
    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang wajib diimplementasikan oleh kelas turunannya
    public abstract void bergerak();
}

