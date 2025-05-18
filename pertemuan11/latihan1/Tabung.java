package latihan1;

// Kelas Tabung mewarisi dari Bentuk
public class Tabung extends Bentuk {
    private int tinggi;  // Atribut tambahan khusus untuk tabung

    // Konstruktor kosong (default), digunakan jika tidak ada data awal
    public Tabung() {
        super(0);  // Panggil konstruktor induk dengan jari2 = 0
    }

    // Konstruktor dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi){
        super(jari2);        // Panggil konstruktor induk
        this.tinggi = tinggi;
    }

    // Implementasi method luas untuk tabung
    @Override
    public double luas(){
        return 2 * PHI * jari2 * (jari2 + tinggi);  // Rumus luas permukaan tabung
    }

    // Getter tinggi
    public int getTinggi(){
        return tinggi;
    }

    // Setter tinggi
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
}
