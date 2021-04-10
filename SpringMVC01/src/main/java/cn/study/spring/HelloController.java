package cn.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@Controller
public class HelloController {
    @RequestMapping("hello.do")
    public String showHello(){
        System.out.println("HelloController.showHello()");
        return "welcome";

    }
}
