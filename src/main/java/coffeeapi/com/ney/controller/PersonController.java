package coffeeapi.com.ney.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffeeapi.com.ney.dtos.PersonDto;
import coffeeapi.com.ney.entity.Person;
import coffeeapi.com.ney.service.PersonService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/people")
public class PersonController {
	
	final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
    
	
	@PostMapping
	public ResponseEntity<Object> savePerson(@RequestBody @Valid PersonDto personDto){
		
		var personModel = new Person();
		
		BeanUtils.copyProperties(personDto, personModel);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(personModel));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Person>> getAllPersons(){
		return ResponseEntity.status(HttpStatus.OK).body(personService.findAll());
	}
	
	
	
	
	
	
	
	
		
}
