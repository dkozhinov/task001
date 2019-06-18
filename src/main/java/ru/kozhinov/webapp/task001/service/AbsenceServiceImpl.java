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
public class AbsenceServiceImpl implements AbsenceService {

    private AbsenceRepository repository;

    @Autowired
    public void setAbsenceRepository(AbsenceRepository repository){
        this.repository = repository;
    }

    @Override
    public Absence getAbsenceById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveAbsence(Absence absence) {
        repository.save(absence);
    }

    @Override
    public List<Absence> findAll(){
        return repository.findAll();
    }

}