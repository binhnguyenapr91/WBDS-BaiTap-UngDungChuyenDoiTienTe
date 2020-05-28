package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForexController {
    @GetMapping("/forexController")
    public ModelAndView forex(@RequestParam float usd,float rate){
        ModelAndView modelAndView = new ModelAndView("result");
        float vnd = usd * rate;
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }
}
