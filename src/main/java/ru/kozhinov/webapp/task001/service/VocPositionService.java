package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import ru.kozhinov.webapp.task001.domain.VocPosition;
import java.util.List;


public interface VocPositionService {
    VocPosition getVocPositionById(Integer id);
    void saveVocName(VocPosition vocPosition);
    List<VocPosition> findAll();
}