package ru.kozhinov.webapp.task001.repository;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kozhinov.webapp.task001.domain.VocName;
import java.util.List;

@Repository
public interface VocNameRepository extends JpaRepository<VocName, Integer>{

    List<VocName> findAllByName(String name);

}