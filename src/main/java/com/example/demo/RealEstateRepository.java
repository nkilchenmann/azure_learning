package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {
}
