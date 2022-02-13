package coffeeapi.com.ney.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffeeapi.com.ney.repository.PersonRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor
public class PersonController {

	
	private PersonRepository personRepository;

    
    
}
