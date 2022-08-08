package BankOperationsXMLConfig;

import java.util.Scanner;

public class SpringBankOperation {
    private String op;
    private String operation;
    Scanner sc =new Scanner(System.in);

    public void setOperation(String operation) {
        this.operation=operation;
    }
    public void getOperation (){
        op=sc.next();
        System.out.println("Now we  "+operation+op);
    }



}
