package bola;

public class bolaMain {
    public static void main(String[] args) {
        ball myBall = new ball("red", 10, false);
        myBall.showColor();
        myBall.showSize();
        myBall.showMoveStatus();
        myBall.moveStatus();
        myBall.showMoveStatus();
        myBall.stop();
        myBall.showMoveStatus();
    }
}