package tugas;

// Kelas Mobil merupakan turunan dari Kendaraan
// Mengimplementasikan interface Klakson
public class Mobil extends Kendaraan implements Klakson {

    // Konstruktor memanggil konstruktor induk
    public Mobil(String nama) {
        super(nama);
    }

    // Implementasi method abstrak bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak di jalan tol.");
    }

    // Implementasi method dari interface Klakson
    @Override
    public void bunyiKlakson() {
        System.out.println("Klakson mobil: Tiiin Tiiin!");
    }
}
