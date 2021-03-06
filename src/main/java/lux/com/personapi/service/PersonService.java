package lux.com.personapi.service;


import lux.com.personapi.entity.Person;
import lux.com.personapi.repository.PersonRepository;
import lux.com.personapi.response.MessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    public MessageResponseDTO createPerson( Person person){
        Person savedPerson=personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savedPerson.getId())
                .build();
    }
}
