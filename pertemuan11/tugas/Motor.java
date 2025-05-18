package tugas;

// Kelas Motor juga merupakan turunan dari Kendaraan
// Serta mengimplementasikan interface Klakson
public class Motor extends Kendaraan implements Klakson {

    // Konstruktor memanggil konstruktor induk
    public Motor(String nama) {
        super(nama);
    }

    // Implementasi method abstrak bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak menggunakan roda 2.");
    }

    // Implementasi method dari interface Klakson
    @Override
    public void bunyiKlakson() {
        System.out.println("Klakson motor: tinittt!");
    }
}

