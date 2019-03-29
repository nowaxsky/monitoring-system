package chuck.dwd.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/index")
  public String index() {
    return "Hello World!";
  }

  @RequestMapping("/fail")
  public String fail() {
    int a = 1 / 0;
    return "Hello World!";
  }
}
