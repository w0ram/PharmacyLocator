package gestion.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.packages.entities.User;
import gestion.packages.idao.IDao;

import gestion.packages.repositories.UserRep;

@Service
public class UserService implements IDao<User> {
	@Autowired
	private UserRep userRep;

	@Override
	public User save(User o) {

		return userRep.save(o);
	}

	@Override
	public User findById(int id) {

		return userRep.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userRep.findAll();
	}

	@Override
	public void delete(User o) {
		userRep.delete(o);

	}

	@Override
	public void update(User o) {
		userRep.save(o);

	}

}
