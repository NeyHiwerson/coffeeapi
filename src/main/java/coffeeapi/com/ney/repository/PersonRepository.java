package coffeeapi.com.ney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coffeeapi.com.ney.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
