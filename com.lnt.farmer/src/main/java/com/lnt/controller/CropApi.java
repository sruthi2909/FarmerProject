package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.Bidding;
import com.lnt.domain.Crop;
import com.lnt.service.CropDaoService;

@CrossOrigin(origins = "*",
methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/crop")
public class CropApi {
	
	@Autowired
	private CropDaoService cropService;

	@GetMapping("/all")
	public List<Crop> getAllCrop(){
		
		return cropService.getAllCropService();
	}
	
	
	
	@GetMapping("/{id}")
	public Crop searchCropById(@PathVariable int id)
	{
		return cropService.searchCropByIdService(id);
	}
	
	@PostMapping("/add")
	void addNewCrop(@RequestBody Crop crop)
	{
		cropService.addNewCropService(crop);
	}
	
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)
	public void approveStatus(@RequestBody Crop crop, @PathVariable int id)
	{
	// System.out.println(req.getStatus());
	cropService.addNewCropService(crop);
	// requestService.approveStatusService(id);

	}
	
	//@PostMapping("/buy/{cropId}")
	//public void buyCrop(@RequestBody Bidding bidding, @PathVariable int cropId)
	//{
		//cropService.buyCropService(bidding, cropId);
	//}
	
	@GetMapping("/buy/{cropId}")
	public void buyCrop(@RequestBody Bidding bidding, @PathVariable int cropId)
	{
		cropService.buyCropService(bidding, cropId);
	}
}
