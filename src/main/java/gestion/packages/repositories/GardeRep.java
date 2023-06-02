package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Garde;

public interface GardeRep extends JpaRepository<Garde, Integer> {
	Garde findById(int id);
}
