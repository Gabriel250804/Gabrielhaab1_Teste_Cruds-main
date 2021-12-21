package com.senai.Haab.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Estado  implements Serializable{
	private static final long serialVersionUID = 1l;

@Column(name="id_estado")
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer id; 
@Column(name="nome_estado")
     private String nome;
 @OneToMany (mappedBy = "estado") 
 @JsonIgnore
private List<Cidade> cidades = new ArrayList<Cidade>();

 public Estado() {
	 
 }

public Estado(Integer id, String nome, List<Cidade> cidades) {
	super();
	this.id = id;
	this.nome = nome;
	this.cidades = cidades;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public List<Cidade> getCidades() {
	return cidades;
}

public void setCidades(List<Cidade> cidades) {
	this.cidades = cidades;
}

@Override
public int hashCode() {
	return Objects.hash(id, nome);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Estado other = (Estado) obj;
	return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
} 

} 

