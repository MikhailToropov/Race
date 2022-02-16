public class App {
    public static void main(String[] args){
        System.out.println("START");
        Car car1 = new Car("Ferrary", 250);
        Car car2 = new Car("Lamba", 300);
        if(car1.getMaxSped() > car2.getMaxSped()){
            System.out.println(car1.getName()+" faster than "+car2.getName());
        }
        else{
            System.out.println(car2.getName()+" faster than "+car1.getName());
        }
        System.out.println(Car.getNumberOfCar());
    }
}
