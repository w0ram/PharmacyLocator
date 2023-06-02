package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Ville;


public interface VilleRep extends JpaRepository<Ville, Integer> {
	Ville findById(int id);
	Ville findByNom(String nom);
	
}
