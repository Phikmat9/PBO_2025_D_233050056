package latihan4;

public class Mobil {
    protected String merk;
    protected String tahun;

    public Mobil(String merk, String tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk(){
        return merk;
    }

    public String getTahun(){
        return tahun;
    }
}
