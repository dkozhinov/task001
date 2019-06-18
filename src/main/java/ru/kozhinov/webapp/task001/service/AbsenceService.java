package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import ru.kozhinov.webapp.task001.domain.Absence;
import java.util.List;


public interface AbsenceService {
    Absence getAbsenceById(Integer id);
    void saveAbsence(Absence absence);
    List<Absence> findAll();
}