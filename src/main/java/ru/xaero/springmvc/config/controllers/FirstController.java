package ru.xaero.springmvc.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.xaero.springmvc.config.services.CalculatorService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    final
    CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        model.addAttribute("name", name);
        model.addAttribute("surname", surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "surname", required = false) String surname,
                          Model model){



        model.addAttribute("name", name);
        model.addAttribute("surname", surname);

        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String getCalculator(
            @RequestParam(value = "action", required = false) String action,
            @RequestParam(value = "a", required = false) int a,
            @RequestParam(value = "b", required = false) int b,
            Model model
    ){

        model.addAttribute("action", action);
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("result", calculatorService.action(action, a, b));

        return "first/calculator";
    }
}
