package com.topcolleguesbackend.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topcolleguesbackend.entites.Collegue;
import com.topcolleguesbackend.repository.CollegueRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/collegues")
public class CollegueController {

	@Autowired CollegueRepository collegueRepository;
	
	@PostConstruct
	public void insertCollegue() {
		collegueRepository.save(new Collegue("Shepard", "https://www.obilisk.co/wp-content/uploads/2017/09/femshep-ME.jpg"));
		collegueRepository.save(new Collegue("Janeway", "http://cdn3-www.afterellen.com/assets/uploads/images/captain-janeway1.jpg"));

	}
	
	@GetMapping
	public List<Collegue> listerCollegues(){
		return this.collegueRepository.findAll();
	}
	

	@GetMapping(value="/{nom}")
	public Collegue getCollegue(@PathVariable String nom) {
		return this.collegueRepository.findByNom(nom);
	}
	
	@PutMapping(value="/{nom}/score")
	public Collegue setCollegueScore(@PathVariable String nom, @RequestBody Collegue collegue) {
		return this.collegueRepository.save(collegue);
	}
	
	@PostMapping
	public Collegue setCollegue(@RequestBody Collegue collegue) {
		return this.collegueRepository.save(collegue);
	}
}
