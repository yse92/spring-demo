package FirstSpring.example2;

public class Automobile implements Vehicle {
    private String autoName;
    public Automobile() {
        System.out.println("конструктор класса Авто по умолчанию");
    }
    public Automobile(String name){
        this.autoName = name;
        System.out.println("конструктор класса Авто с параметром: " + autoName);
    }
    //реализуем method go()
    @Override
    public void start() {

        System.out.println("Vrooooom!!");
    }
    public void setAutoName(String autoName) {
        this.autoName = autoName;
        System.out.println("У меня " + this.autoName);
    }
    public String getAutoName() {
        return autoName;
    }
}
