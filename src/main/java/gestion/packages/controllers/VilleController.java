package gestion.packages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.packages.entities.Ville;

import gestion.packages.services.VilleService;


@RestController
@RequestMapping("api/ville")
@CrossOrigin
public class VilleController {
	@Autowired
	private VilleService villeServ;

	@PostMapping("/save")
	public void save(@RequestBody Ville ville) {
		villeServ.save(ville);
	}

	@GetMapping("/all")
	
	public List<Ville> findAll() {
		return villeServ.findAll();
	}
	@GetMapping("/{id}")
	public Ville findById(@PathVariable int id) {
	    return villeServ.findById(id);
	}
	

	
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
		Ville v = villeServ.findById(Integer.parseInt(id));
		villeServ.delete(v);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody Ville ville){
	    Ville v = villeServ.findById(Integer.parseInt(id));
	    v.setNom(ville.getNom());
	    villeServ.update(v);
	}
}
