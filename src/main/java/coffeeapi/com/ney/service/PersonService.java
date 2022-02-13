package coffeeapi.com.ney.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import coffeeapi.com.ney.entity.Person;
import coffeeapi.com.ney.repository.PersonRepository;

@Service
public class PersonService {
	
	
	final PersonRepository personRepository;
	
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}


	@Transactional
	public Person save(Person personModel) {
		
		return personRepository.save(personModel);
	}

}
