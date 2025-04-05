package latihan;

public class MainObjekNull {
    public static void main(String[] args) {
        
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);
        
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
        System.out.println("l3 jari-jari: " + l3.getJari2());
        
        l2 = null;
        if (l2 != null) {
            System.out.println("l2 jari-jari: " + l2.getJari2());
        } else {
            System.out.println("l2 adalah null.");
        }
    }
}
