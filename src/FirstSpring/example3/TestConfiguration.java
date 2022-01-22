package FirstSpring.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Конфигурационный класс Spring IoC контейнера
 */
@Configuration
@ComponentScan
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("Инициализация запуска контейнера Spring ...");
    }
    @Bean
    Address address() {
        return new Address();
    }
    @Bean
    User user() {
        return new User();
    }
}
