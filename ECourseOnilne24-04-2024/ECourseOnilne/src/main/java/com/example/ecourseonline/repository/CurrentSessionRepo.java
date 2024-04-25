package com.example.ecourseonline.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecourseonline.entity.CurrentSessionUser;

@Repository
public interface CurrentSessionRepo extends JpaRepository<CurrentSessionUser, String> {
	public Optional<CurrentSessionUser> findByuuId(String uuId);

}
