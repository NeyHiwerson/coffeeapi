package coffeeapi.com.ney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import coffeeapi.com.ney.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
