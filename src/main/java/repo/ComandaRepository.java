package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Comanda;

public interface ComandaRepository extends JpaRepository<Comanda, Long>{

}
