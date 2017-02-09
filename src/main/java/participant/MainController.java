package participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@Autowired
	private DBManager database;
	private UserInfo user;

	@GetMapping("/")
	public String landing(Model model) {
		model.addAttribute("userInfo", new UserInfo());
		return "index";
	}

	@RequestMapping("/")
	public String landingSubmit(@ModelAttribute("userInfo") UserInfo userInfo, Model model) {
		user = database.findByEmail(userInfo.getEmail());
		user.calcularEdad();
		model.addAttribute("user",user);
		return "datos";
	}
	
}