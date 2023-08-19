package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    PersonRepository personRepo;

    public PersonService(PersonRepository personRepo){
        this.personRepo = personRepo;
    }

    public PersonRepository getPersonRepo() {
        return personRepo;
    }

    public void setPersonRepo(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
