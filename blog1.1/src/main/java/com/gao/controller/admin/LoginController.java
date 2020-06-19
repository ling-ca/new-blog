package com.gao.controller.admin;

import com.gao.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String loginPage() {
        return "admin/login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        RedirectAttributes attributes, HttpSession session) {

        System.out.println("本次用户名：" + username + "   密码：" + password);


//        //获取当前的用户
//        Subject subject = SecurityUtils.getSubject();
//        //封装用户的登录数据
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//        try {
//            subject.login(token); //执行登录的方法，如果没有异常说明ok
//            return "admin/index";
//        } catch (UnknownAccountException e) {//用户名不存在
//            attributes.addFlashAttribute("message", "用户名错误");
//            return "redirect:/admin";
//        } catch (IncorrectCredentialsException e) {//密码不存在
//            attributes.addFlashAttribute("message", "密码错误");
//            return "redirect:/admin";
//        }

/*        // TODO: 2020/4/8 0008 要传个userID
        if(username.equals("admin") && password.equals("123456")){
            User user = new User();
            user.setId(new Long(1));
            user.setPassword("123456");
            user.setUsername("admin");
            session.setAttribute("user", user);
            // TODO: 2020/4/8 0008 user能拿到吗
            return "admin/index";
        }else {
            attributes.addFlashAttribute("message", "用户名错误或密码不存在");
            return "redirect:/admin";
        }*/

        return "admin/index";
    }


    @GetMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "admin/login";
    }
}