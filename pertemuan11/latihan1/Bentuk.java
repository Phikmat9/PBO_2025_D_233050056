package latihan1;

// Kelas abstrak Bentuk mewakili bentuk dasar seperti lingkaran/tabung
public abstract class Bentuk {
    protected double PHI = 3.14;  // Konstanta phi
    protected int jari2;          // Atribut jari-jari

    // Konstruktor Bentuk dengan parameter jari-jari
    public Bentuk(int jari2){
        super();                // Memanggil konstruktor induk (Object)
        this.jari2 = jari2;     // Set nilai jari-jari
    }

    // Method abstrak luas() yang wajib diimplementasikan oleh subclass
    public abstract double luas();

    // Getter jari-jari
    public int getJari2(){
        return jari2;
    }

    // Setter jari-jari
    public void setJari2(int jari2){
        this.jari2 = jari2;
    }
}
