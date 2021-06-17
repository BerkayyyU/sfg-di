package tr.edu.berkayulguel.trakya.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.ConstructorInjectedController;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.MyController;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.PropertyInjectedController;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.SetterInjectedController;


@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        var context  = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");


        System.out.println(myController.sayHello());

        System.out.println("-------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
