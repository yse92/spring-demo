package FirstSpring.example2;

//внедряет зависимость
public class Driver {
    private Vehicle vehicle;
    private String name;
    private int age;
    public Driver() {

    }
    public Driver(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    //alt + ins
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void callVehicle(){
        System.out.println("Поехали со мной");
        vehicle.start();
    }
}
