package FirstSpring.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //Address address = context.getBean("Address", Address.class);
        //address.getHome();
        //without xml-config :
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        //User user = context.getBean(User.class);
    }
}
