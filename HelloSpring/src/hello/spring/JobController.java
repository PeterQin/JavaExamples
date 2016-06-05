package hello.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Job")
public class JobController {
	private static Log FLog = LogFactory.getLog(JobController.class);
	
	@RequestMapping
    public String DisplayJob(){   
        return "DisplayJob";
    }
	
    @RequestMapping(params="action=GetJob")
    public String GetJob(@RequestParam String aJobID, Model aModel){   
    	FLog.info("Job ID: " + aJobID); 
        return "getJob";
    }
}