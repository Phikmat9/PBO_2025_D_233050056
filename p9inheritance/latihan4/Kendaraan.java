package latihan4;

public class Kendaraan extends Mobil {
    private int jumlahCC;

    public Kendaraan(String merk, int tahun, int jumlahCC) {
        super(merk, tahun);
        setJumlahCC(jumlahCC);
    }

    public int getJumlahCC() {
        return jumlahCC;
    }

    public void setJumlahCC(int jumlahCC) {
        this.jumlahCC = jumlahCC;
    }

}
