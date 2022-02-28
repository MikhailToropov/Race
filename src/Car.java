public interface Car {
    void move(boolean move);
    void setGear(int gear);
    void setSpeed(int speed);
    void gearUp();
    void gearDown();
    String getMove();
    String getCurrentGear();
    String getCurrentSpeed();
}
