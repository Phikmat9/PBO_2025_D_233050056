package latihan2; // pertemuan 11

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank "IF111" dan PIN "123"
        KartuElektronik Kartu = new KartuElektronik("IF111", "123");

        // Melakukan otentikasi dengan input PIN "123" (cocok dengan yang disimpan)
        System.out.println("Otentikasi: " + Kartu.otentikasi("123"));  // Hasil: true
    }
}
