package springdockerexample.springdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdockerexampleApplication {

	@GetMapping(value="data")
	public String hello() {
		return "This is Example";
	}
	@GetMapping(value="asad")
	public String asad() {
		return "This is asad";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringdockerexampleApplication.class, args);
	}

}
