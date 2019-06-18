package ru.kozhinov.webapp.task001.controllers;


/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kozhinov.webapp.task001.repository.AbsenceRepository;
import ru.kozhinov.webapp.task001.domain.Absence;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    @Autowired
    private AbsenceRepository repository;



    @GetMapping("/all")
    public @ResponseBody Iterable<Absence> getAllUsers() {
        return repository.findAll();
    }


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("absences", repository.findAll());
        return "index";
    }

}
