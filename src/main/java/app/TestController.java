package app;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class TestController {
@RequestMapping("/")
public String home() {
return "Spring boot is working!";
}
}