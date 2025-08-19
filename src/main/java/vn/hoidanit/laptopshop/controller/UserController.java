package vn.hoidanit.laptopshop.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;


@Controller
public class UserController {

    @RequestMapping("/")
    public String getHomepage(){
        return "home.html";
    }
    
}

// @RestController
// public class UserController {
//     private final UserService userService;
    

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }


//     @RequestMapping("/")
//     public String getHomepage(){
//         return this.userService.handleHelloWorld();
//     }

// }