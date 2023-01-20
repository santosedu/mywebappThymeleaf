package br.com.eduardo.MyWebAppThymeleaf.service;

import br.com.eduardo.MyWebAppThymeleaf.entities.User;
import br.com.eduardo.MyWebAppThymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Eduardo Alves dos Santos
 * @created 20/01/2023
 */
@Service
public class UserService {
    @Autowired
    private UserRepository repo;


    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }
}
