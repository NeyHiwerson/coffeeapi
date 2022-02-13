package coffeeapi.com.ney.service;

import org.springframework.stereotype.Service;

import coffeeapi.com.ney.repository.PersonRepository;

@Service
public class PersonService {
	
	
	final PersonRepository personRepository;
	
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

}
