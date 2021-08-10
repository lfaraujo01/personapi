package lux.com.personapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getbook(){
        return "Olha ai Lijaninha, pira o cabeção na pogramação kkkk";
    }
}
