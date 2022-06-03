package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home(HttpServletRequest req){
        String name=req.getParameter("name");
        System.out.println("hii" +name);
        req.setAttribute("name",name);
        return "index.jsp";
    }
}
