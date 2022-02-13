package coffeeapi.com.ney.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffeeapi.com.ney.service.PersonService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/people")
public class PersonController {
	
	final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
    
		
}
