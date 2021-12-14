package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ItemCos;
import model.Produs;
import model.Utilizator;

@Repository
public interface ItemCosRepository extends JpaRepository<ItemCos, Long>{

	public List<ItemCos> findByUtilizator(Utilizator utilizator);
	
	public ItemCos findByUtilizatorAndProdus(Utilizator utilizator, Produs produs);
}
