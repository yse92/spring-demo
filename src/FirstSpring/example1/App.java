package FirstSpring.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
//        /*
//            Example 1
//        */
//        //подключаем файл конфигурации
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //Vehicle vehicle = (Vehicle) context.getBean("myAuto"); // полчучаем бин по id
//        //или так
//        Vehicle vehicle = context.getBean("myAuto", Vehicle.class);
//        vehicle.go();
//        context.close();
//        /*
//            Example2 без IoC и DI
//         */
//        Automobile myAuto = new Automobile();
//        Driver driver = new Driver(myAuto);
//        driver.startVehicle();
//        /*
//            Example 3 с применением DI
//         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Driver driver = context.getBean("myDriver", Driver.class);
        driver.callVehicle();
        context.close();

    }
}
