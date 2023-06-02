package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.DateGarde;
import gestion.packages.entities.Pharmacie;
import gestion.packages.idao.IDao;
import gestion.packages.repositories.DateGardeRep;

@Service
public class DateGardeService implements IDao<DateGarde> {

	@Autowired
	private DateGardeRep dateGardeRep;

	@Override
	public DateGarde save(DateGarde c) {
		return dateGardeRep.save(c);
	}

	@Override
	public DateGarde findById(int id) {
		return dateGardeRep.findById(id);
	}

	@Override
	public List<DateGarde> findAll() {
		return dateGardeRep.findAll();
	}

	@Override
	public void delete(DateGarde c) {
		dateGardeRep.delete(c);
	}

	@Override
	public void update(DateGarde o) {
		dateGardeRep.save(o);

	}

}
