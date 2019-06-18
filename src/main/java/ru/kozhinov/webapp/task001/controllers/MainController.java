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
import org.springframework.web.servlet.ModelAndView;
import ru.kozhinov.webapp.task001.service.AbsenceService;
import ru.kozhinov.webapp.task001.domain.Absence;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    @Autowired
    private AbsenceService service;



    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Model list(Model model) {

        List<Absence> absences = service.findAll();
        model.addAttribute("absences", absences);

        return model;
    }




    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newAbsence(Model model) {
        model.addAttribute("absence", new Absence());
        return "edit";
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
    public String editAbsence(@PathVariable Integer id, Model model) {
        Absence absence = service.getAbsenceById(id);
        model.addAttribute("absence", absence);
        return "operations/edit";
    }



}
