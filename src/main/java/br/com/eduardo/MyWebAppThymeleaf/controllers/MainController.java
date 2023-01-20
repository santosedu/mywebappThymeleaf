package br.com.eduardo.MyWebAppThymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Eduardo Alves dos Santos
 * @created 20/01/2023
 */
@Controller
public class MainController {

    @GetMapping("/home")
    public String showHomePage() {
        return "index";
    }
}
