package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Utilizator;

@Repository
public interface UtilizatorRepository extends JpaRepository<Utilizator, Long> {
}
