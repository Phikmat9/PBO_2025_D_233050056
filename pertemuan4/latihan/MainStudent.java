package latihan;

public class MainStudent {
    public static void main(String[] args) {
        
    Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println("NRP x: " + x.getNrp());
        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println("NRP x: " + x.getNrp());
        System.out.println("NRP y: " + y.getNrp());
    }
}
