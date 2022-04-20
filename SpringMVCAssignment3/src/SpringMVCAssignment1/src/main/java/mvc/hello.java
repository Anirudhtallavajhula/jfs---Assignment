package mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class hello {
 
    @RequestMapping("/helloworld")
    public ModelAndView hellow() {
 
        String helloWorldMessage = "Hello world";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}