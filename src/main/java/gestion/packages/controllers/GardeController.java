package gestion.packages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.packages.entities.Garde;

import gestion.packages.services.GardeService;

@RestController
@RequestMapping("api/garde")
@CrossOrigin(origins = "http://localhost:3000")
public class GardeController {
	@Autowired
	private GardeService gardeServ;

	@GetMapping("/all")
	public List<Garde> findAll() {
		return gardeServ.findAll();
	}
}
