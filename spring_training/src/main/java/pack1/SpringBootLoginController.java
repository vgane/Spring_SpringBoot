package pack1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableAutoConfiguration
@RestController
public class SpringBootLoginController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootLoginController.class, args);
    }
}