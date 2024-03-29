package ru.kozhinov.webapp.task001.repository;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kozhinov.webapp.task001.domain.Absence;
import java.util.List;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Integer>{
    List<Absence> findByName(String name);
    List<Absence> findByPosition(String position);
    List<Absence> findByCause(String cause);
}
