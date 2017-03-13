package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by scott on 2017/3/13.
 */
@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/")
    public String greeting(){
        return "Hello World!";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
