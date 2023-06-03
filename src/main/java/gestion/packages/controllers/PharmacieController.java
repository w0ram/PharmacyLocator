package gestion.packages.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import gestion.packages.entities.Pharmacie;

import gestion.packages.services.PharmacieService;

@RestController
@RequestMapping("api/pharmacie")
@CrossOrigin
public class PharmacieController {
	@Autowired
	private PharmacieService pharmService;

	@PostMapping("/save")
	public void save(@RequestBody Pharmacie pharm) {
		pharmService.save(pharm);
	}
	  @PostMapping("/uploadImage")
	  public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
	    try {
	      // Save the file to a specific location
	      String fileName = file.getOriginalFilename();
	      String filePath = "/path/to/save/" + fileName;  // Adjust the file path as needed
	      
	      // Save the file
	      file.transferTo(new File(filePath));
	      
	      // Process the file or store its information in the database
	      
	      return ResponseEntity.ok("Image uploaded successfully");
	    } catch (IOException e) {
	      // Handle any exceptions that occur during file upload
	      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image");
	    }
	  }
	
	@GetMapping("/all")
	public List<Pharmacie> findAll() {
		return pharmService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie p = pharmService.findById(Integer.parseInt(id));
		pharmService.delete(p);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody Pharmacie pharmacie) {
		Pharmacie p = pharmService.findById(Integer.parseInt(id));
		p.setNom(pharmacie.getNom());
		pharmService.update(p);
	}

	@GetMapping("/{id}")
	public Pharmacie findById(@PathVariable int id) {
		return pharmService.findById(id);
	}

}
