	package com.omar.equipe.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ligue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigue;
	private String nomLigue;
	private String pays;
	@JsonIgnore
	@OneToMany(mappedBy = "ligue")
	private List<Equipe> produits;

	
}
