package com.example.astra.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.astra.astraEntity.Astra;
import com.example.astra.repositories.AstraRepository;
import com.example.astra.responses.AstraRecordDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("astra")
public class AstraController {
	
	@Autowired
	AstraRepository astraRepository;

	
	@GetMapping("/travel")
	public ResponseEntity<List<Astra>> getAll() {
		List<Astra> astraList = astraRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(astraList);
	}
	@PostMapping
	public ResponseEntity<Astra> postAstra(@RequestBody AstraRecordDto astraRecordDto ){
		var astra = new Astra(astraRecordDto);
		if(astra.getCombustivel().equals("Gasolina")) {
			astra.setValorTotal(astra.getKm() / 9 * 6.10);
			
		}
		if(astra.getCombustivel().equals("Etanol")) {
			astra.setValorTotal(astra.getKm() / 7 * 4.04);
			
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(astraRepository.save(astra));
	}
	
} 
