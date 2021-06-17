package tr.edu.berkayulguel.trakya.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.berkayulguel.trakya.sfgdi.controllers.*;


@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        var context  = SpringApplication.run(SfgDiApplication.class, args);
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayGreeting());

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
