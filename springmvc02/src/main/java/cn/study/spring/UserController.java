package cn.study.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("reg.do")
    public String showReg() {
        System.out.println("UserController.showReg()");
        return "reg";
    }

    @RequestMapping("handle_reg.do")
    public String handleReg(User user, String code) {
//        System.out.println("UserController.handel_reg()");
//        System.out.println("username:" + user.getUsername());
//        System.out.println("password:" + user.getPassword());
//        System.out.println("gender:" + user.getGender());
//        System.out.println("age:" + (user.getAge() + 1));
//        System.out.println("phone:" + user.getPhone());
//        System.out.println("email:" + user.getEmail());
//
//        String[] skill= user.getSkill();
//        System.out.println(skill.length);
//        for (int i = 0; i < skill.length; i++) {
//            System.out.println("skill[" + i + "]:" + skill[i]);
//        }
        System.out.println(user);
        System.out.println("code:" + code);
        return "regdone";
    }

    @RequestMapping("login.do")
    public String showLogin() {
        System.out.println("UserController.showLogin()");
        return "login";
    }

    /**
     * 注意：连接URL必须是以.do 结尾，应为配置的dispatchslevlet处理 xxx.do请求
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("handleLogin.do")
    public String handleLogin(String username, String password, ModelMap modelMap) {
        System.out.println("UserController.handelLogin()");
        System.out.println("username:" + username);
        System.out.println("password:" + password);

        //假定root/1234是正确的用户名/密码

        if ("root".equals(username)) {
            if ("1234".equals(password)) {
                //登录成功
                System.out.println("登录成功");
            } else {
                //密码错误
                System.out.println("密码错误");
                modelMap.addAttribute("errormessage","密码错误");
                return "error";
            }

        } else {
            //用户名错误
            System.out.println("用户名不存在");
            modelMap.addAttribute("errormessage","用户名不存在");
            return "error";

        }

        return "logindone";
    }
}
