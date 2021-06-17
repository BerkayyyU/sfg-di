package tr.edu.berkayulguel.trakya.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import tr.edu.berkayulguel.trakya.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
