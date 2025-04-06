package bola;

public class bolaMain {
    public static void main(String[] args) {
        ball myBall = new ball("red", 10, false);
        myBall.showColor();
        myBall.showSize();
        myBall.showMoveStatus();
        myBall.move();
        myBall.showMoveStatus();
        myBall.stop();
        myBall.showMoveStatus();
    }
}