package zzuspringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zzuspringMVC.entity.User;
import zzuspringMVC.entity.UserDao;
import zzuspringMVC.entity.UserService;

import java.util.List;

/**
 * @author ASUS
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    UserService userService;


   // @GetMapping (value = "/index/{id}")
    //@ResponseBody
   // public String user1( @PathVariable("id") Integer uid) {
        //值封直接装成user对象，参数直接封装成对象，可以直接实现对象的封装
        //System.out.println(uid);
        //视图模型
       // return "userinfor";
   // }
    //@RequestMapping("/login2")

    @GetMapping(value ="/index/{id}" )
    public String user2(@PathVariable("id") Integer uid, Model model){
        User user = userService.getUser(uid);
        model.addAttribute("user",user);
        return "hello";
    }
}
