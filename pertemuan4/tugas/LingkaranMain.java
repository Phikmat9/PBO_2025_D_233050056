package tugas;

public class LingkaranMain {
    public static void main(String[] args) {
        // Contoh referensi objek
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        
        System.out.println("Sebelum perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
        
        // Mengubah nilai melalui referensi l2
        l2.setJari2(12);
        
        System.out.println("Setelah perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    } 
}


