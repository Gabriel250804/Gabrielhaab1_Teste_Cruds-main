package com.senai.Haab.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Haab.services.ClienteService;
import com.senai.Haab.domain.Cliente;

@RestController 
@RequestMapping(value = "/clientes")
public class ClienteResource { 
	@Autowired
private ClienteService service;
@RequestMapping
	public ResponseEntity<Cliente>find (@PathVariable Integer id){
	Cliente obj = service.buscar(id); 
	return ResponseEntity.ok().body(obj);
}
}
