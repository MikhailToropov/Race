public class App {
    public static void main(String[] args){
        System.out.println("START");
        Pollo pollo = new Pollo("My Car");
        pollo.move(true);
        System.out.println(pollo.getMove());
    }
}
