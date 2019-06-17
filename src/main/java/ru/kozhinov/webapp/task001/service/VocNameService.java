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
public class VocNameService {

    @Autowired
    private final VocNameRepository repository;

    public VocNameService(VocNameRepository vocNameRepository){
        this.repository = vocNameRepository;
    }


    public List<VocName> findAll(){
        return repository.findAll();
    }

    public List<VocName> findByName(String name) {
        return repository.findByName(name);
    }


}