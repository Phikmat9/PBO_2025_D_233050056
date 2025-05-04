package latihan4;

public class Main {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan("Nissan GTR r32", " 1994 ", " 2600 ");
        System.out.println
        (
            k.getMerk()+
            " Tahun:" + k.getTahun()+
            " Jumlah CC:" + k.getJumlahCC()
        );
    }
}
