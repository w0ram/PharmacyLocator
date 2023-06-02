package gestion.packages.idao;

import java.util.List;

import gestion.packages.entities.Ville;

public interface IDao<T> {
	
	T save(T o);
	
	T findById(int id);
	
	List<T> findAll();
	
	void delete(T o);
	void update(T o);


	
	

}
