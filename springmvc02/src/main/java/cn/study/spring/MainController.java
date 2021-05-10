package cn.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wm
 */
@Controller
public class MainController {
    @RequestMapping("index.do")
    public String showIndex(){
        System.out.println("MainController.showIndex()");
        return "index";
    }
}
