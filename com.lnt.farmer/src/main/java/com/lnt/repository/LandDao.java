package com.lnt.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Land;

public interface LandDao {

	public void addNewLand(Land l);
	List<Land> getAllLand();
}
