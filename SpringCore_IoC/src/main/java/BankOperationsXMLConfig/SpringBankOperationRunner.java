package BankOperationsXMLConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBankOperationRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-bankOperation-bean.xml");
        SpringBankOperation operation = (SpringBankOperation) context.getBean("operation");
        operation.getOperation();
    }
}
