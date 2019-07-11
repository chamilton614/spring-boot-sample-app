package hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String hello() {
        return "Spring Boot - Hello there from your OpenShift Application!";
    }
}
