package br.com.eduardo.MyWebAppThymeleaf.repository;

import br.com.eduardo.MyWebAppThymeleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Eduardo Alves dos Santos
 * @created 20/01/2023
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
