package latihan1; // (pertemuan 11)

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJari2()); // Tampilkan jari-jari
        System.out.println("luas: " + lingkaran.luas());      // Tampilkan luas lingkaran

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung tabung = new Tabung(10, 5);
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJari2() + ", tinggi: " + tabung.getTinggi()); // Tampilkan data
        System.out.println("luas: " + tabung.luas());  // Tampilkan luas tabung
    }
}
