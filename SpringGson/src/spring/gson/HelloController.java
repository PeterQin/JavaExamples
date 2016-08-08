package spring.gson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController 
{
	
	@RequestMapping("/gson")
	@ResponseBody
	public Data HelloGson() 
	{
		Data resultData = new Data();
		resultData.setFAge(1);
		resultData.setFName("spring");
		return resultData;
	}
}
