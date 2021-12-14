package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Produs;

@Repository
public interface ProdusRepository extends JpaRepository<Produs, Long> {
}
