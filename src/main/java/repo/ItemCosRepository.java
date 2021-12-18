package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Carte;
import model.ItemCos;
import model.Utilizator;

@Repository
public interface ItemCosRepository extends JpaRepository<ItemCos, Long>{

	public List<ItemCos> findByUtilizator(Utilizator utilizator);

	public ItemCos findByUtilizatorAndCarte(Utilizator utilizator, Carte carte);
}
