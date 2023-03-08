<<<<<<< HEAD
package com.sist.web;

public class MainController {

}
=======
package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("main/main.do")
	public String main_main() {
		return "main";
	}
}
>>>>>>> branch 'master' of https://github.com/classHaru1/ClassHaru.git
