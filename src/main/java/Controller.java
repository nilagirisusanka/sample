
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String helloeveryone(){
        return "Hello everyone, Welcome to Spring Boot and happy learning";
    }
}
