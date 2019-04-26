package com.capgemini.mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.TdsMaster;
import com.capgemini.service.TDSService;
import com.capgemini.uiexception.IdNotFoundException;

@RestController
@RequestMapping("/user")
public class HomeController {

	@Autowired
	TDSService service; //Creating service object
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@GetMapping("/tds/{id}")
	public TdsMaster getById(@PathVariable int id) {//getById() returns object if found else null 
		TdsMaster tds=service.getById(id);
		if(tds==null) {
			//We have an custom defined exception
			throw new IdNotFoundException("ID Not Found Wrong ID "+id);
		}
		else
			return tds;
	}
}
