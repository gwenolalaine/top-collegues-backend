package com.topcolleguesbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/etat")
@CrossOrigin(origins = "*")
public class EtatController {
	
	@GetMapping
	public boolean retournerEtat() {
		return true;
	}
}
