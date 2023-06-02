package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Pharmacie;

public interface PharmacieRep extends JpaRepository<Pharmacie, Integer> {
	Pharmacie findById(int id);
	// @Query("SELECT p FROM Pharmacie p JOIN p.zone z JOIN z.ville v WHERE v.nom
	// =?1 AND z.nom =?2")
	// List<Pharmacie> findAllByVilleAndZone(String ville,String zone);

	// @Query("SELECT p FROM Pharmacie p JOIN p.zone z JOIN z.ville v JOIN
	// p.pharmacieGardes pg WHERE v.nom = :ville AND z.nom = :zone AND pg.garde.type
	// = :period ")
	// List<Pharmacie> findAllPh(@Param("ville") String ville, @Param("zone") String
	// zone, @Param("period") String period);

}
