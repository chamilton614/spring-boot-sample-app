package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return service.hello();
    }
}
