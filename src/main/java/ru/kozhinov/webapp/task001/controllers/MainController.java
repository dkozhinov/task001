package ru.kozhinov.webapp.task001.controllers;


/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.kozhinov.webapp.task001.service.AbsenceService;
import ru.kozhinov.webapp.task001.domain.Absence;

import java.util.List;

@Controller
public class MainController {


    private AbsenceService service;

    @Autowired
    public void setAbsenceService(AbsenceService service) {
        this.service = service;
    }


    @RequestMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("absences", service.getAll());
        return "main";
    }

    @RequestMapping(value="/editor", method= RequestMethod.GET)
    public String absenceForm(Model model) {
        model.addAttribute("absence", new Absence());
        return "editor";
    }

    @RequestMapping(value="/editor/submit", method=RequestMethod.POST)
    public String absenceSubmit(@ModelAttribute Absence absence) {
        service.createAbsence(absence);
        return "result";
    }



}
