package FirstSpring.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        Driver driver = (Driver) context.getBean("myDriver");
        System.out.println(driver.getAge());
        System.out.println(driver.getName());
        driver.callVehicle();
        context.close();
    }
}
