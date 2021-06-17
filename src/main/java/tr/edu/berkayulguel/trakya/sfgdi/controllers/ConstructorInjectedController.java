package tr.edu.berkayulguel.trakya.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tr.edu.berkayulguel.trakya.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    @Autowired
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
