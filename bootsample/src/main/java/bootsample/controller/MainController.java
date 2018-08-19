package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired	
	@GetMapping("/home")
	public String home()
	{
		return ("index"); 		
	}
}
