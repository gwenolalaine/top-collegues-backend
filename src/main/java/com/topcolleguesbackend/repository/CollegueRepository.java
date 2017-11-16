package com.topcolleguesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topcolleguesbackend.entites.Collegue;

public interface CollegueRepository extends JpaRepository<Collegue, Integer>{
	public Collegue findByNom(String nom);
}
