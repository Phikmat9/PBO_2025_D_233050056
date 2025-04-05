package pertemuan_2;
public class ball { 5 usages
    private String Color; 4 usages
    private int Size; 4 usages
    private boolean MoveStatus; 6 usages

    public void moves() {...}
    public void Stop() {...}
    public void ShowStatus() {...}
    public void ShowColor() {System.out.println("the color of ball is" + Color + '.');}
    public void ShowSize() {System.out.println("the sixe of ball is" + Size + '.');};
}

public class Innerball {
    public static void main(String[] args) {
        Ball myBall = new ball(Color)
    }

    
}