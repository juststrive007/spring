package cn.study.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class HelloController {
    @RequestMapping("hello.do")
    public String showHello(){
        System.out.println("HelloController.showHello()");
        return "welcome";
    }
}
