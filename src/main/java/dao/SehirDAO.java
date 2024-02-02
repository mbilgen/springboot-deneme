package dao;

import model.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
@Component
public interface SehirDAO extends JpaRepository<Sehir, Integer> {



}
