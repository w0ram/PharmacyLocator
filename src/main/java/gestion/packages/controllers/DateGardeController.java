package gestion.packages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.packages.entities.DateGarde;
import gestion.packages.entities.Pharmacie;
import gestion.packages.entities.Role;
import gestion.packages.services.DateGardeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/GardePharmacie")
@CrossOrigin
public class DateGardeController {
    @Autowired
    private DateGardeService dateGardeService;

    @PostMapping("/save")
	public void save(@RequestBody DateGarde dateGarde) {
    	dateGardeService.save(dateGarde);
	}

    @GetMapping("/All")
    public List<DateGarde> findAll(){
        return dateGardeService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
    	DateGarde p=dateGardeService.findById(id);
    	dateGardeService.delete(p);
    }
    @GetMapping("/{id}")
	public DateGarde findById(@PathVariable int id) {
		return dateGardeService.findById(id);
	}


    @PutMapping("/update")
    public void update(@PathVariable(required = true) String id, @RequestBody DateGarde dateGarde) {
		DateGarde dg = dateGardeService.findById(Integer.parseInt(id));
		dg.setGarde(dateGarde.getGarde());
		dateGardeService.update(dg);
	}



}
