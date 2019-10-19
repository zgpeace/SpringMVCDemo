package zgpeace.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping("/say")
  public String say(Model model) {
    //return "/WEB-INF/jsp/say.jsp";

    model.addAttribute("name", "zgpeace");
    model.addAttribute("url", "https://blog.csdn.net/zgpeace");

    return "say";
  }
}
