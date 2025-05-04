package latihan2;

public class Mobil {
    protected String merk;
    protected int tahun;

    public void Mobil () {
       merk = "Honda Brio";
       tahun = 2019 ;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahun(){
        return tahun;
    }

}
