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
import ru.kozhinov.webapp.task001.repository.VocNameRepository;
import ru.kozhinov.webapp.task001.repository.VocPositionRepository;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class MainController {


    @Autowired
    private AbsenceRepository repository;

    @Autowired
    private VocNameRepository vocNameRepository;

    @Autowired
    private VocPositionRepository vocPositionRepository;


    @GetMapping("/all")
    public @ResponseBody Iterable<Absence> getAllUsers() {
        return repository.findAll();
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("absences", repository.findAll());
        return "index";
    }


    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("absence", new Absence());
        return "search";
    }

    @PostMapping("/searchnameabsence")
    public String searchnameabsence(@ModelAttribute("absence") Absence absence, Model model) {
        model.addAttribute("absences", repository.findByName(absence.getName()));
        return "searchabsence";
    }
    @PostMapping("/searchpositionabsence")
    public String searchpositionabsence(@ModelAttribute("absence") Absence absence, Model model) {
        model.addAttribute("absences", repository.findByPosition(absence.getPosition()));
        return "searchabsence";
    }
    @PostMapping("/searchcauseabsence")
    public String searchcauseabsence(@ModelAttribute("absence") Absence absence, Model model) {
        model.addAttribute("absences", repository.findByCause(absence.getCause()));
        return "searchabsence";
    }



    @GetMapping("/editor")
    public String edit(Model model) {
        model.addAttribute("absence", new Absence());
        model.addAttribute("vocnames", vocNameRepository.findAll());
        model.addAttribute("vocpositions", vocPositionRepository.findAll());
        return "editor";
    }

    @PostMapping("/addabsence")
    public String submit(@ModelAttribute("absence") Absence absence) {
        repository.save(absence);
        return "result";
    }


}
