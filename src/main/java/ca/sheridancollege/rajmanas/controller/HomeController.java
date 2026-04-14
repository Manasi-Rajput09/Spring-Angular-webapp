package ca.sheridancollege.rajmanas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "forward:/index.html";
    }

}

// The reason you got a 404 is that your index() method returned "index".

// Because we specifically didn't install Thymeleaf when setting up the Spring Boot POM, Spring doesn't have its smart web engine to automatically append the .html extension anymore. It looked for a file purely named index with no extension, and threw a 404 Not Found.