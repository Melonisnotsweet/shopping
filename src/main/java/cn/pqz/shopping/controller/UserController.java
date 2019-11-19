package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.User;
import cn.pqz.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //登录
    @RequestMapping(value = "/user/login",method = RequestMethod.GET)
    public String toLogin()
    {
        return "login";
    }
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("ID") String ID,
                        @RequestParam("password") String password,
                        Model model,HttpSession session){
        User user =userService.findUser(ID,password);
        if (user!=null)
        {
            session.setAttribute("loginUser",user.getName());
            session.setAttribute("UserId",user.getID());
            return "redirect:/main.html";
        }
        else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }
    }
    //注册
    @RequestMapping(value = "/user/register",method = RequestMethod.GET)
    public String toRes()
    {
        return "reg";
    }
    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    public String res(User user)
    {
       int row=userService.addUser(user);
       return "login";
    }
    @RequestMapping(value = "/user/user")
    public String toUser(HttpSession session,Model model)
    {
        String ID=(String) session.getAttribute("UserId");
        System.out.println(ID);
        User user=userService.selectUser(ID);
        model.addAttribute("users",user);
        return "user";
    }
    @RequestMapping(value = "/user/user",method = RequestMethod.POST)
    public String User(User user)
    {
        System.out.println("控制层"+user);
        int row=userService.updateUser(user);
        return "redirect:user";
    }
    @RequestMapping(value = "/user/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "redirect:login";
    }

}

