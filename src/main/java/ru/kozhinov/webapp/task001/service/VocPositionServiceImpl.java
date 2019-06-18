package ru.kozhinov.webapp.task001.service;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import org.springframework.stereotype.Service;
import ru.kozhinov.webapp.task001.domain.VocPosition;
import ru.kozhinov.webapp.task001.repository.VocPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class VocPositionServiceImpl implements VocPositionService {

    @Autowired
    private VocPositionRepository repository;


    @Override
    public VocPosition getVocPositionById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void saveVocName(VocPosition vocPosition) {
        repository.save(vocPosition);
    }

    @Override
    public List<VocPosition> findAll(){
        return repository.findAll();
    }

}