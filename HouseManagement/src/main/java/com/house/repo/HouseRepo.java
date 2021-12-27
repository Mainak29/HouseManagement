package com.house.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.house.model.HouseModels;

public interface HouseRepo extends CrudRepository<HouseModels, Integer>{
	Optional<HouseModels> findById(int houseId);

	Optional<HouseModels> findByName(String type);

}
