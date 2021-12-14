package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Cos;

@Repository
public interface CosRepository extends JpaRepository<Cos, Long>{

}
