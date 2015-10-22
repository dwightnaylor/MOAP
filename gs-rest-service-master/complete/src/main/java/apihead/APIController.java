package apihead;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	public APIController(){
	}
	@RequestMapping("/solve")
	public Passer passer(@RequestParam(value="problem", defaultValue="") String problem){
		return new Passer(problem);
	}
}
