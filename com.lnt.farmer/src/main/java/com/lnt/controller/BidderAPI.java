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

import com.lnt.domain.Bidder;
import com.lnt.domain.Farmer;
import com.lnt.service.BidderService;

@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

@RestController
@RequestMapping("/bidder")
public class BidderAPI {
	@Autowired
	private BidderService bidderService;
	//to get all bidder list
	@RequestMapping("/all")
	public List<Bidder> getAllBidder() {
		return bidderService.getAllBidderService();
	}
	@GetMapping("/{id}")
//	@RequestMapping("/{id}")
	public Bidder findBidderById(@PathVariable int id) {
		return bidderService.serachByIdService(id);
		
	}
	@PostMapping("/add")
	public void addNewBidder(@RequestBody Bidder b) {
		//System.out.println(b.getFullName());
		bidderService.addBidderService(b);
		
	}
	
	@PostMapping(value = "/login")
	public boolean login(@RequestBody Bidder bidder) {



	System.out.println("Logged IN!");
	System.out.println(bidder.getEmailId());
	System.out.println(bidder.getPassword());
	List<Bidder> bidders = bidderService.getAllBidderService();
	for (Bidder b : bidders) {
	if (b.getEmailId().equals(bidder.getEmailId()) && b.getPassword().equals(bidder.getPassword())) {
	return true;
	}
	}
	return false;
	}
	
	

}
