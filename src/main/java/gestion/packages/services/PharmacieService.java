package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.Pharmacie;

import gestion.packages.idao.IDao;
import gestion.packages.repositories.PharmacieRep;

@Service
public class PharmacieService implements IDao<Pharmacie> {
	@Autowired
	private PharmacieRep pharmacieRep;

	@Override
	public Pharmacie save(Pharmacie o) {

		return pharmacieRep.save(o);
	}

	@Override
	public Pharmacie findById(int id) {

		return pharmacieRep.findById(id);
	}

	@Override
	public List<Pharmacie> findAll() {
		return pharmacieRep.findAll();
	}

	@Override
	public void delete(Pharmacie o) {
		pharmacieRep.delete(o);

	}

	@Override
	public void update(Pharmacie o) {
		pharmacieRep.save(o);

	}

}