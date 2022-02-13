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
	
	
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
	

}
