package latihan1;

// Kelas Lingkaran mewarisi dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor Lingkaran, menerima jari-jari dan memanggil konstruktor induk
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Implementasi method luas dari kelas Bentuk
    @Override
    public double luas(){
        return PHI * jari2 * jari2;  // Rumus luas lingkaran: π × r²
    }
}
