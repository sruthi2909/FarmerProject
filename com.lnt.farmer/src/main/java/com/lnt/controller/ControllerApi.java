package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


import com.lnt.domain.Farmer;
import com.lnt.domain.Land;
import com.lnt.service.FarmerService;
import com.lnt.service.LandService;

@CrossOrigin(origins = "*",
methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/farmer")
public class ControllerApi {
	
	@Autowired
	private FarmerService farmerService;
//	private LandInfoService landService;

	@PostMapping("/addfarmer")
	public void addNewfarmer(@RequestBody Farmer f)
	{
		farmerService.addNewFarmerService(f);
	}
	
	@GetMapping("/getfarmer")
	List<Farmer> getAllFarmer()
	{
		return farmerService.getAllFarmerSerice();
	}
	
	@PostMapping(value = "/login")
	public boolean login(@RequestBody Farmer farmer) {



	System.out.println("Logged IN!");
	System.out.println(farmer.getEmailId());
	System.out.println(farmer.getPassword());
	List<Farmer> farmers = farmerService.getAllFarmerSerice();
	for (Farmer f : farmers) {
	if (f.getEmailId().equals(farmer.getEmailId()) && f.getPassword().equals(farmer.getPassword())) {
	return true;
	}
	}
	return false;
	}
	
	
//	@PostMapping("/postland")
//	public void addNewLand(@RequestBody LandInfo l)
//	{
//		landService.addNewLandService(l);
//	}
//	@GetMapping("/getland")
//	List<LandInfo> getAllLand()
//	{
//		return landService.getAllLandService();
//	}
}
