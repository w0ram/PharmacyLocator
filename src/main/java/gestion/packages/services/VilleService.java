package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.Ville;
import gestion.packages.idao.IDao;
import gestion.packages.repositories.VilleRep;

@Service
public class VilleService implements IDao<Ville> {
	@Autowired
	private VilleRep villeRep;

	@Override
	public Ville save(Ville o) {

		return villeRep.save(o);
	}

	@Override
	public Ville findById(int id) {

		return villeRep.findById(id);
	}
	

	@Override
	public List<Ville> findAll() {
		return villeRep.findAll();
	}

	@Override
	public void delete(Ville o) {
		villeRep.delete(o);

	}

	@Override
	public void update(Ville o) {
		villeRep.save(o);

	}

}
