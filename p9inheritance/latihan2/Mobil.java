package latihan2;

public class Mobil {
    protected String merk;
    protected int tahun;

    public Mobil() {
       merk = "Tidak diketahui";
       tahun = 0 ;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahun(){
        return tahun;
    }

}
