package cn.study.sample.controller;

import cn.study.sample.entity.User;
import cn.study.sample.mapper.UserMapper;
import cn.study.sample.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("reg")
    public JsonResult handleReg(User user){
        JsonResult jsonResult = new JsonResult();
        User resutl = userMapper.findByUsername(user.getUsername());
        if(resutl == null){
            userMapper.insert(user);
            jsonResult.setCode(1);
        }else {
            jsonResult.setCode(2);
            jsonResult.setMessage("用户已存在");
        }

        return jsonResult;
    }
}
