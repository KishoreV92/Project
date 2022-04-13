package Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Demo";
	}
	@PostMapping("/login")
	public void login(@RequestBody User user) {
		System.out.println(user.getUserName() + ":" + user.getPassword());
	}
}
