package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import org.springframework.stereotype.Service;
import ru.kozhinov.webapp.task001.domain.Absence;
import ru.kozhinov.webapp.task001.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AbsenceService {

    @Autowired
    private final AbsenceRepository repository;

    public AbsenceService(AbsenceRepository absenceRepository){
        this.repository = absenceRepository;
    }

    public void createAbsence(Absence absence){
        repository.save(absence);
    }

    public List<Absence> findAll(){
        return repository.findAll();
    }

    public List<Absence> findByName(String name) {
        return repository.findByName(name);
    }

}