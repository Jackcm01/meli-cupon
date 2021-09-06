package com.meli.cupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meli.cupon.entity.Petition;
import com.meli.cupon.entity.Response;
import com.meli.cupon.service.CuponService;




@RestController
@RequestMapping("/cupon")
@ResponseBody
public class CuponController {
	
	@Autowired
	private CuponService cuponService;
	
	@GetMapping
	ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hola, Actualmente solo funciono como POST :) ");
	}
	
	@PostMapping
	ResponseEntity<Response> getCupon(@RequestBody Petition petition ) {
		Response theResponse = cuponService.getCupon(petition);
		HttpStatus status = HttpStatus.OK;
		if(theResponse.getTotal() == 0 ) {
			status = HttpStatus.NOT_FOUND;			
		}
		return ResponseEntity.status(status).body(theResponse);
//		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
}
