package br.com.eduardo.MyWebAppThymeleaf.entities;

import br.com.eduardo.MyWebAppThymeleaf.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Eduardo Alves dos Santos
 * @created 20/01/2023
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Test
    public void testAddNewUser() {
        User user = new User();

        user.setEmail("eduarda.santos@gmail.com");
        user.setPassword("eduarda1234");
        int length = user.getPassword().length();
        System.out.println(length);
        user.setFirstName("Eduarda");
        user.setLastName("Santos");

        User userSaved = repo.save(user);
        Assertions.assertNotNull(userSaved);
        Assertions.assertTrue(userSaved.getId() != null);
    }

    @Test
    public void showAllUsers(){
        Iterable<User> userList = repo.findAll();
        int size = 0;
        if(userList instanceof Collection){
            size = ((Collection<User>) userList).size();
        }
        Assertions.assertNotNull(userList);
        Assertions.assertEquals(2, size);
    }

    @Test
    public void testUpdateUser() {
        Integer userId = 1;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        user.setPassword("hello2023");
        repo.save(user);

        Assertions.assertEquals("hello2023", optionalUser.get().getPassword());
    }

    @Test
    public void testGetUser() {
        Integer userId = 2;
        Optional<User> optionalUser = repo.findById(userId);

        Assertions.assertTrue(optionalUser.isPresent());
    }

    @Test
    public void testDeleteUser() {
        Integer userId = 2;
        repo.deleteById(userId);
        Optional<User> optionalUser = repo.findById(userId);

        Assertions.assertTrue(!optionalUser.isPresent());

    }

}
