package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Editura;

@Repository
public interface EdituraRepository extends JpaRepository<Editura, Long>{

}
