package HelloXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Консольный вывод приветственного сообщения
public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SpringHelloWorld helloWorld = (SpringHelloWorld) context.getBean("helloWorld");
        helloWorld.getHelloMessage();

    }
}
