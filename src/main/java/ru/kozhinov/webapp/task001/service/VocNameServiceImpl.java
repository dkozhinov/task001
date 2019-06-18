package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import org.springframework.stereotype.Service;
import ru.kozhinov.webapp.task001.domain.VocName;
import ru.kozhinov.webapp.task001.repository.VocNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VocNameServiceImpl implements VocNameService {

    @Autowired
    private VocNameRepository repository;


    @Override
    public VocName getVocNameById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveVocName(VocName vocName) {
        repository.save(vocName);
    }

    @Override
    public List<VocName> findAll(){
        return repository.findAll();
    }

}