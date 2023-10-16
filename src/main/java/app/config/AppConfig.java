package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "Dog")
    public Dog getDogBean() {
        return new Dog();
    }

    @Bean(name = "Timer")
    public Timer getTimerBean() {
        return new Timer();
    }
}
