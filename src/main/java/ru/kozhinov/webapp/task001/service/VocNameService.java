package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import ru.kozhinov.webapp.task001.domain.VocName;
import java.util.List;


public interface VocNameService {
    VocName getVocNameById(Integer id);
    void saveVocName(VocName vocName);
    List<VocName> findAll();
}