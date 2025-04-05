package latihan;

public class Main {
    public static void main(String[] args) {
        // Contoh referensi objek
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        
        System.out.println("Sebelum perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());
        
        l2.setJari2(10);
        
        System.out.println("Setelah perubahan:");
        System.out.println("l1 jari-jari: " + l1.getJari2());
        System.out.println("l2 jari-jari: " + l2.getJari2());

        // Contoh referensi objek NULL
        Lingkaran l3 = new Lingkaran(7);
        l2 = l3;
        System.out.println("l3 jari-jari: " + l3.getJari2());
        
        l2 = null;
        if (l2 != null) {
            System.out.println("l2 jari-jari: " + l2.getJari2());
        } else {
            System.out.println("l2 adalah null.");
        }

        // Contoh Student
        Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println("NRP x: " + x.getNrp());
        System.out.println("NRP y: " + y.getNrp());
        
        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println("NRP x: " + x.getNrp());
        System.out.println("NRP y: " + y.getNrp());
    }
}
