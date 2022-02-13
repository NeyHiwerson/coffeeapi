package coffeeapi.com.ney.dtos;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonDto {
	
	@Size(max = 60)
	private String name;
	 
	
	@Size(max = 11)	
	private String CPF;
	
	
	@Size(max = 60)
	private String food;

}
