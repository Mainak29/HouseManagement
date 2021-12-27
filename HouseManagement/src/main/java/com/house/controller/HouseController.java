package com.house.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.house.model.HouseModels;
import com.house.repo.HouseRepo;

@RestController
@EnableAutoConfiguration
public class HouseController {
	@Autowired
	private HouseRepo rp;
	
	@PostMapping("/saveHouse")
	public String saveHouse(@RequestBody HouseModels hm) {
		rp.save(hm);
		return "save success";
	}
	
	@GetMapping("/getAllHouse")
	public List<HouseModels> getAll(){
		return (List<HouseModels>)rp.findAll();
	}
	
	@GetMapping("/getHouse/{id}")
	public Optional<HouseModels> getbyId(@PathVariable("id") int id){
		return rp.findById(id);
	}
	
	@GetMapping("/getByType/{type}")
	public Optional<HouseModels> getbyType(@PathVariable("type") String type){
		return rp.findByName(type);
	}
	
	@DeleteMapping("deleteHouse/{id}")
	public String getDelete(@PathVariable("id") int id) {
		int temp_id =id;
		rp.deleteById(id);
		return "House Removed ! "+temp_id;
	}
}
