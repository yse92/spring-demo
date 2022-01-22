package FirstSpring.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String firstName;
    private String lastName;
    private Address address;
    public User() {

    }
    @Autowired
    public User(Address address){
        System.out.println("user's adress...");
        this.address = address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
