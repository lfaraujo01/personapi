package lux.com.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lux.com.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {


}
