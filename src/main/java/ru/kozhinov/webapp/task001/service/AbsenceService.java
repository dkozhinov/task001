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

import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    public List<Absence> getAll(){

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(repository.findAll().iterator(), Spliterator.NONNULL),false)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

    }

    public List<Absence> findByName(String name) {
        return repository.findByName(name);
    }

}