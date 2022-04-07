public class App {
    public static void main(String[] args){
        System.out.println("START");
        Pollo pollo = new Pollo("My Car");
        pollo.move(false);
        pollo.setForsage(true);
        System.out.println(pollo.getMove());
        System.out.println(pollo.getForsage());
        // Написать класс гараж, в котором будут храниться автомобили
        Garage garage = new Garage();
        // В классе реализовать метод добавления автомобиля в гараж
        garage.addCar(pollo);
        // Реализовать метод вывода статуса всех машин (Едет/не едет)
        garage.getCarsMoveStatus();
        // Реализовать метод который запустит все машины
        garage.runAllCars();
        // Убедиться что все машины едут.
        garage.getCarsMoveStatus();
    }
}
