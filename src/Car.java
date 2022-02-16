abstract class Car{
    private final String name;
    private final int maxSped;
    private int currentSpeed;
    public Car(String name, int maxSped){
        this.name = name;
        this.maxSped = maxSped;
    }
    public String getName() {
        return this.name;
    }

    public int getMaxSped() {
        return this.maxSped;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

}
