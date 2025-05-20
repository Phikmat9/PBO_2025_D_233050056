package tugas;

public class Tank extends Kendaraan implements Klakson  {
     // Konstruktor memanggil konstruktor induk
    public Tank(String nama) {
        super(nama);
    }

    // Implementasi method abstrak bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak menggunakan roda tapak rantai.");
    }

    // Implementasi method dari interface Klakson
    @Override
    public void bunyiKlakson() {
        System.out.println("Klakson mobil: maledakkk!!!");
    }
}
