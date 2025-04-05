package latihan;

public class MainObjek {
    public static void main(String[] args) {
    
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        
        System.out.println("Sebelum perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
        
        l2.setJari2(10);
        
        System.out.println("Setelah perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
    }
}
