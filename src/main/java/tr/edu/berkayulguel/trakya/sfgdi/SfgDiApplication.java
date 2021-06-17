package tr.edu.berkayulguel.trakya.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.MyController;


@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        var context  = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
