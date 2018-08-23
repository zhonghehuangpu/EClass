package com.jiaqi.eclass.control;


import com.jiaqi.eclass.entity.User;
import com.jiaqi.eclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @RequestMapping("/demo")
    String toIndex(Model model) {
//        User user = new User();
//        user.setId(3211023);
//        userService.insert(user);
        return "index";
    }
}
