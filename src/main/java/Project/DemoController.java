package Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoController {

	@GetMapping("/home")
	public String hello() {
		return "Hello All";
	}
	
	@GetMapping("/user")
	public String helloUser() {
		return "Hello User";
	}
	
	@GetMapping("/admin")
	public String helloAdmin() {
		return "Hello Admin";
	}
}
