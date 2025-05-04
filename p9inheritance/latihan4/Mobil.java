package latihan4;

public class Mobil {
    protected String merk;
    protected int tahun;

    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahun(){
        return tahun;
    }
}
