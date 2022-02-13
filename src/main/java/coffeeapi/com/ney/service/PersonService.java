package coffeeapi.com.ney.service;

import java.util.List;
import java.util.Optional;

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


	public List<Person> findAll() {
		
		return personRepository.findAll();
	}


	public Optional<Person> findById(Long id) {
		
		return personRepository.findById(id);
	}

}
