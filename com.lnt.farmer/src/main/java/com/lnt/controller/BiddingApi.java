package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.Bidding;
import com.lnt.service.BiddingService;

@Component
@RestController
@CrossOrigin(origins = "*",
methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class BiddingApi {

	
			
			@Autowired
			private BiddingService biddingService;

			@PostMapping("/add")
			public void addNewBidding(@RequestBody Bidding b ) {
			biddingService.addNewBiddingService(b);

			}
			@GetMapping("/all")
			List<Bidding> getAllbidding(){
			return biddingService.getAllBiddingService();

			}



			
}
