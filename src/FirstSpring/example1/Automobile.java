package FirstSpring.example1;

public class Automobile implements Vehicle {
    Automobile(){
        System.out.println("Это моё авто...");
    }
    //реализуем method go()
    @Override
    public void start() {
        System.out.println("Vrooooom!!");
    }
}
