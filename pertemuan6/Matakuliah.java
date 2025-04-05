package pertemuan6;

public class Matakuliah {
    private String kodeMatakuliah;
    private String namaMatakuliah;
    private String nilaiHuruf;
    private int sks;

    public Matakuliah(String kodeMatakuliah, String namaMatakuliah, String nilaiHuruf, int sks) {
        this.kodeMatakuliah = kodeMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
    }

    public String getKodeMatakuliah() {
        return kodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public int getSks() {
        return sks;
    }

    public void tampilkanInfo() {
        System.out.println(kodeMatakuliah + " - " + namaMatakuliah + " - " + nilaiHuruf + " - " + sks);
    }
}

