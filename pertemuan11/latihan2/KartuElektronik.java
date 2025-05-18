package latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    private String KodeBank;  // Menyimpan kode identitas bank
    private String pin;       // Menyimpan PIN asli yang diset saat objek dibuat

    // Konstruktor untuk menginisialisasi kode bank dan PIN
    public KartuElektronik(String KodeBank, String pin) {
        super();                  // Memanggil konstruktor Object
        this.KodeBank = KodeBank;
        this.pin = pin;
    }

    // Implementasi method otentikasi dari interface
    // Mengecek apakah PIN input dari user sama dengan PIN yang disimpan
    @Override
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput))
            return true;    // PIN cocok → berhasil
        else
            return false;   // PIN tidak cocok → gagal
    }

    // Implementasi method encode dari interface
    // Saat ini masih mengembalikan null karena belum diisi logika encoding
    @Override
    public String encode(String pin) {
        return null;
    }
}
