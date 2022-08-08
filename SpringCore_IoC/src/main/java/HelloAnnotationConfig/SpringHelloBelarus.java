package HelloAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringHelloBelarus {

    @Autowired
    private String helloMessage;
    public void getHelloMessage() {
            System.out.println("Hello message  " + helloMessage);
        }
}
