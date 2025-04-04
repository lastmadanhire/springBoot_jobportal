
package com.jobportal.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping({ "/home", "/" })
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

}
