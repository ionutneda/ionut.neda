package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
