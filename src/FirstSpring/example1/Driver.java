package FirstSpring.example1;

//внедряет зависимость
public class Driver {
    private Vehicle vehicle;
    public Driver() {

    }
    public Driver(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    //alt + ins
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void callVehicle(){
        System.out.println("Поехали со мной");
        vehicle.start();
    }
}
