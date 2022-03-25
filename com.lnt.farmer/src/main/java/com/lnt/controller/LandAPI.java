package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.lnt.domain.FarmerInfo;
import com.lnt.domain.Land;
//import com.lnt.service.FarmerInfoService;
import com.lnt.service.LandService;
@CrossOrigin(origins ="*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/land")
public class LandAPI {
	@Autowired
	
	private LandService landService;

	
	
	@PostMapping("/addland")
	public void addNewLand(@RequestBody Land l)
	{
		System.out.println("Hi................");
		landService.addNewLandService(l);
	}
	@GetMapping("/getland")
	List<Land> getAllLand()
	{
		return landService.getAllLandService();
	}

}
