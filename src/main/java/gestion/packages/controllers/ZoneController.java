package gestion.packages.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
import gestion.packages.entities.Zone;
import gestion.packages.repositories.VilleRep;
import gestion.packages.services.VilleService;
import gestion.packages.services.ZoneService;

@RestController
@RequestMapping("api/zone")
@CrossOrigin(origins = "http://localhost:3000")
public class ZoneController {
	@Autowired
	private ZoneService zoneServ;
	@Autowired
	private VilleService villeServ;

	@PostMapping("/save")
	public void save(@RequestBody Zone zone) {
		zoneServ.save(zone);
	}

	@GetMapping("/{id}")
	public Zone findById(@PathVariable int id) {
		return zoneServ.findById(id);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return zoneServ.findAllWithVille();
	}
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone z = zoneServ.findById(Integer.parseInt(id));
		zoneServ.delete(z);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody Zone zone) {
		Zone z = zoneServ.findById(Integer.parseInt(id));
		z.setNom(zone.getNom());
		zoneServ.update(z);
	
	}
	 @GetMapping("/ville/{nom}")
	    public List<Zone> getAllZone(@PathVariable String nom){
	        return zoneServ.findAllByVille(nom);
	    }


	

}
