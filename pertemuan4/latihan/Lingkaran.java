package latihan;

public class Lingkaran {
    private int jari2;
    
    public Lingkaran(int jari2) {
        this.jari2 = jari2;
    }
    
    public int getJari2() {
        return jari2;
    }
    
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}

// Kelas Student
class Student {
    private String nrp;
    
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    
    public String getNrp() {
        return nrp;
    }
}

// Kelas Node
class Node {
    private int value;
    private Node node;
}

// Kelas Persistence
class Persistence {
    public void save(Lingkaran obj) {
        System.out.println("Lingkaran dengan jari-jari " + obj.getJari2() + " disimpan.");
    }
}
