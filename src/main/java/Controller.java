
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/helloeveryone")
    //the is my endpoint helloeveryone
    public String helloeveryone(){
        return "hello everyone, welcome to spring boot and happy learning!";
    }
}
