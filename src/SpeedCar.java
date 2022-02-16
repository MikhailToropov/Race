public class SpeedCar extends Car{
    public SpeedCar(String name, int speed) {
        super(name, speed);
        numberOfCar+=1;
    }
    private static int numberOfCar=0;
    public static String getNumberOfCar(){
        return String.format("Number of SpeedCar is %s", numberOfCar);
    }
}
