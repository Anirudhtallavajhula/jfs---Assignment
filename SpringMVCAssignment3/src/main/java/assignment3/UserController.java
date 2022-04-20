package assignment3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login.html", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		
		ModelAndView mv = new ModelAndView("login");
		
		return mv;
		
	}
	
		
	
	@RequestMapping(value="/assignment3/index.html", method = RequestMethod.POST)
	public ModelAndView UserValidation(@ModelAttribute("userName1") User user1) {
		if(User.getUserName().equals("Anirudh") && User.getPassword().equals("Anirudh")) {
			ModelAndView mv1 = new ModelAndView("success");
			return mv1;
		
	}
	
		else {
			ModelAndView mv1 = new ModelAndView("error");
			return mv1;
	}
	
	

	}
}

