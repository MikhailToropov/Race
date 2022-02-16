public class App {
    public static void main(String[] args){
        System.out.println("START");
        Car car1 = new SpeedCar("Ferrary", 250);
        Car car2 = new SpeedCar("Lamba", 300);
        if(car1.getMaxSped() > car2.getMaxSped()){
            System.out.println(car1.getName()+" faster than "+car2.getName());
        }
        else{
            System.out.println(car1.getName()+" faster than "+car2.getName());
        }
        System.out.println(SpeedCar.getNumberOfCar());
    }
}
