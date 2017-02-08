package participant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@Autowired
	private DBManager database;

	 @RequestMapping("/")
	    public String landing() {
		 UserInfo c = database.findByEmail("marcos@gmail.com");
		 System.out.println(c.getNombre().toString());
	        return "index";
	    }


}