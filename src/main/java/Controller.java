
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String helloeveryone(){
        //the end point will return Hello everyone, Welcome to Spring Boot and happy learning message
        return "Hello everyone, Welcome to Spring Boot and happy learning";
    }
}
