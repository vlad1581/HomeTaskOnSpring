package HelloAnnotationConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloBelarusRunner {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            SpringHelloBelarus helloWorld = context.getBean("helloWorld",SpringHelloBelarus.class);
            helloWorld.getHelloMessage();
        }

    }
