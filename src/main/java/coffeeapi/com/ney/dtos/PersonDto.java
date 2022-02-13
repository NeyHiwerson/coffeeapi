package coffeeapi.com.ney.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonDto {
	
	@NotBlank
	private String name;
	 
	@NotBlank
	@Size(max = 11)
	@org.hibernate.validator.constraints.br.CPF
	private String CPF;
	
	@NotBlank
	@Size(max = 60)
	private String food;

}
