package participant;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	 @RequestMapping("/")
	    public String landing() {
	        return "index";
	    }
	

}