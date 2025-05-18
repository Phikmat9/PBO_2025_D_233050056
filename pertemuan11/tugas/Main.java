package tugas; //pertemuan 11

// Kelas Main berfungsi sebagai titik awal eksekusi program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil dan menyimpannya sebagai tipe Kendaraan
        Kendaraan kendaraan1 = new Mobil("Toyota Camry");
        kendaraan1.bergerak(); // Memanggil method bergerak()

        // Melakukan cast ke interface Klakson agar bisa memanggil bunyiKlakson()
        ((Klakson) kendaraan1).bunyiKlakson();

        System.out.println(); // Baris kosong

        // Membuat objek Motor dan menyimpannya sebagai tipe Kendaraan
        Kendaraan kendaraan2 = new Motor("Yamaha R1");
        kendaraan2.bergerak(); // Memanggil method bergerak()

        // Memanggil method bunyiKlakson melalui cast
        ((Klakson) kendaraan2).bunyiKlakson();
    }
}

