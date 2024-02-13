package ru.xaero.springmvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping()
    public String index(Model model){
        //Получим всех людей их DAO и передадим на отображение в представление
        return null;
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model){
        //Получим 1 одного человека по его id из DAO и передадим в представление
        return null;
    }
}
