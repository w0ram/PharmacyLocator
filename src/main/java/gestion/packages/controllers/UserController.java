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

import gestion.packages.entities.User;

import gestion.packages.services.UserService;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userServ;

	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userServ.save(user);
	}

	@GetMapping("/all")
	public List<User> findAll() {
		return userServ.findAll();
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable int id) {
		return userServ.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		User v = userServ.findById(Integer.parseInt(id));
		userServ.delete(v);
	}

	@PutMapping("/update/{id}")
	public void update(@PathVariable(required = true) String id, @RequestBody User user) {
		User v = userServ.findById(Integer.parseInt(id));
		v.setNom(user.getNom());
		userServ.update(v);
	}
}
