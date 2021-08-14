package lux.com.personapi.controller;


import lux.com.personapi.entity.Person;
import lux.com.personapi.repository.PersonRepository;
import lux.com.personapi.response.MessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;


    @Autowired
    public PersonController (PersonRepository personRepository){
        this.personRepository = personRepository;

    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson=personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savedPerson.getId())
                .build();
    }
}
