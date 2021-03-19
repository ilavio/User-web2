package il.tu.mi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {
	
	@GetMapping()
	public String users() {
		return "users";
	}
}
