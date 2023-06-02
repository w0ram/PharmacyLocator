package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.Garde;

import gestion.packages.idao.IDao;
import gestion.packages.repositories.GardeRep;

@Service
public class GardeService implements IDao<Garde> {
	@Autowired
	private GardeRep gardeRep;

	@Override
	public Garde save(Garde o) {

		return gardeRep.save(o);
	}

	@Override
	public Garde findById(int id) {

		return gardeRep.findById(id);
	}

	@Override
	public List<Garde> findAll() {
		return gardeRep.findAll();
	}

	@Override
	public void delete(Garde o) {
		gardeRep.delete(o);

	}

	@Override
	public void update(Garde o) {
		gardeRep.save(o);

	}

}
