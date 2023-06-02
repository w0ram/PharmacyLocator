package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.DateGarde;


public interface DateGardeRep extends JpaRepository<DateGarde, Integer> {
	DateGarde findById(int id);

	// @Query("select gp from Garde_Pharmacie gp where CURRENT_DATE NOT BETWEEN
	// gp.pg.dateDebut and gp.dateFin")
	// List<DateGarde> findAllPharmaciesDisponible();

	// @Query("select gp from Garde_Pharmacie gp where CURRENT_DATE BETWEEN
	// gp.pg.dateDebut and gp.dateFin ")
	// List<DateGarde> findAllPharmaciesEnGarde();

	// @Query(value="select gp.pharmacie,
	// min(sqrt(power((gp.pharmacie.latitude-:lat),2)+power((gp.pharmacie.longitude-:long),2)))
	// from Garde_Pharmacie gp where gp.pharmacie.zone.nom = :zone and
	// gp.pharmacie.zone.ville.nom = :ville and gp.garde.type like 'jour'")
	// List<ArrayList<E>> findDistanceJour(@Param("lat") double lat, @Param("long")
	// double lon, @Param("zone") String zone, @Param("ville") String ville);

	// @Query(value="select gp.pharmacie,
	// min(sqrt(power((gp.pharmacie.latitude-:lat),2)+power((gp.pharmacie.longitude-:long),2)))
	// from Garde_Pharmacie gp where gp.pharmacie.zone.nom = :zone and
	// gp.pharmacie.zone.ville.nom = :ville and gp.garde.type like 'nuit'")
	// List<ArrayList> findDistanceNuit(@Param("lat") double lat, @Param("long")
	// double lon, @Param("zone") String zone, @Param("ville") String ville);

}
