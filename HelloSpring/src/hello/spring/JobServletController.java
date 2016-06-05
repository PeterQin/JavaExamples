package hello.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/JobServlet")
public class JobServletController {
 
    @RequestMapping
    public String hello(@RequestParam String action){
    	if (action.equals("getJob")) {
			return "forward:/getJob"; 
		}
    	
        return "hello";
    }
}