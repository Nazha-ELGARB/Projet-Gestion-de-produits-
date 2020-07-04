package org.sid.dao;

import java.util.List;

import org.sid.entities.Personne;
import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
	@Query("select p from Personne p where p.email like :x ")
	public List<Personne> chercher(@Param("x") String mc);

	public void save(String string);

	

}
