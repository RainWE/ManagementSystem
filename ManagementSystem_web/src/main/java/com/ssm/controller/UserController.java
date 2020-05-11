package com.ssm.controller;

import com.ssm.domain.UserInfo;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-11
 * @Description:com.ssm.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //查询指定id用户
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id)throws Exception{
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo=userService.findById(id);
        mv.addObject("user",userInfo);
//        mv.setViewName("user-show");
        mv.setViewName("user-show1");
        return mv;
    }
    //用户添加
    @RequestMapping("/save.do")
    public String save(UserInfo userInfo)throws Exception{
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList=userService.findAll();
        mv.addObject("userList",userList);
        mv.setViewName("user-list");
        return mv;
    }

}
