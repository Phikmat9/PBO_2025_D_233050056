package latihan4;

public class Kendaraan extends Mobil {
    private String jumlahCC;

    public Kendaraan(String merk, String tahun, String jumlahCC) {
        super(merk, tahun);
        setJumlahCC(jumlahCC);
    }

    public String getJumlahCC() {
        return jumlahCC;
    }

    public void setJumlahCC(String jumlahCC) {
        this.jumlahCC = jumlahCC;
    }

}
