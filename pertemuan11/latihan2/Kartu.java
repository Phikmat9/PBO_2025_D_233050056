package latihan2;

// Interface Kartu mendefinisikan 2 method abstrak
public interface Kartu {

    // Method untuk otentikasi, mengembalikan nilai true/false berdasarkan kecocokan PIN
    public boolean otentikasi(String pin);

    // Method untuk mengenkripsi/menyandikan PIN, mengembalikan PIN yang telah diencode
    public String encode(String pin);
}
