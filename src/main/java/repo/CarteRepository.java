package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Carte;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {
}
