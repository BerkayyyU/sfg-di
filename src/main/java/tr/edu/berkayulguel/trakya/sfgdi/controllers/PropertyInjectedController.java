package tr.edu.berkayulguel.trakya.sfgdi.controllers;

import tr.edu.berkayulguel.trakya.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
