package hello.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Job")
public class JobController {
 
    @RequestMapping(params="action=getJob")
    public String getJob(){        
        return "getJob";
    }
}