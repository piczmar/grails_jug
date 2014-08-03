package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MvcController {

	@Autowired
	private MyService myService;
	

    @RequestMapping(value = "/mvc/test.dispatch", 
    	method = RequestMethod.GET)
    public ModelAndView getText() {
		String msg = myService.method();
        return new ModelAndView("/mvc/result/test", 
        	new ModelMap("text", " - from MVC controller, " + msg));
    }

}
