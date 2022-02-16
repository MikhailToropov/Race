public class Car{
    private final String name;
    private final int maxSped;
    private int currentSpeed;
    private static int numberOfCar=0;
    protected String color;
    public Car(String argumentName, int argumentMaxSped){
        this.name = argumentName;
        this.maxSped = argumentMaxSped;
        numberOfCar+=1;
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

    public static String getNumberOfCar(){
        return String.format("Number of SpeedCar is %s", numberOfCar);
    }

}
