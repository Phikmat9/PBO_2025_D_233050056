package pertemuan5;

public class TranskripNilaiMain {
    public static void main(String[] args) {
      //create objek matakuliah
      Matakuliah mk1 = new matakuliah("001", "Algoritma Pemograman 1", "A", 3);
      Matakuliah mk2 = new matakuliah("002", "Algoritma Pemograman 2", "BC", 3);
      Matakuliah mk3 = new matakuliah("003", "Pemograman Berorientasi objek", "B", 3);
        
      //create objek KHS
      KartuHasilStudi khs = new kartuHasilStudi ("20222");
      khs.addMatakuliah(mk1);
      khs.addMatakuliah(mk2);
      khs.addMatakuliah(mk3);

      //create objek mahasiswa
      mahasiswa mhs = new mahasiswa ("303040001", "Jhon");
      
      //create objek TranskripNilai
      TranskripNilai transkrip = new TranskripNilai(mhs);
      Transkrip.addKHS (khs);
      transkrip.display();
    }
}
