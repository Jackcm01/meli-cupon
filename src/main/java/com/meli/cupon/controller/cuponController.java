package com.meli.cupon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meli.cupon.entity.Petition;
import com.meli.cupon.util.ResponseStatusException;




@RestController
@RequestMapping("/cupon")
@ResponseBody
public class cuponController {
	
	@GetMapping
	ResponseEntity<String> hello() {
		return ResponseEntity.ok("hellow Wolrd");
	}
	
	@PostMapping
	ResponseEntity<String> getCupon(@RequestBody Petition petition ) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(petition.getItem_ids()[1].getId());
//		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}
