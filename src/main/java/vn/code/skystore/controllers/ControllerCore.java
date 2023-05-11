package vn.code.skystore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerCore {
    @GetMapping("/chat")
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("chat");
        //mav.addObject("employees", employeeRepository.findAll());
        return mav;
    }
}
