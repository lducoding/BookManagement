package com.server.boot.androidserver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping(value = "/aa" , method = {RequestMethod.GET})
    public String androidPage(HttpServletRequest request, Model model) {
        System.out.println("서버에서 안드로이드 접속 요청함");
        return "main";
    }
}
