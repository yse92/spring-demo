package FirstSpring.example3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//по умолчанию id бина address
//@Component("myAddress")

@Component
public class Address {
    private String name;
    @Value("${address.home}")
    private String home;
    private int room;

    public Address(String name, String home, int room) {
        this.name = name;
        this.home = home;
        this.room = room;
    }
    public Address() {
        System.out.println("Address is initializing...");
    }

    public int getRoom() {
        return room;
    }

    public String getHome() {
        System.out.println("Try to get home...");
        return home;
    }

    public String getName() {
        return name;
    }
}
