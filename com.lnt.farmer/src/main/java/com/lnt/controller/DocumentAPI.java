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

import com.lnt.domain.Document;
import com.lnt.service.DocumentService;

@CrossOrigin(origins = "*",
methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

@RestController
@RequestMapping("/document")

public class DocumentAPI {
	@Autowired
	private DocumentService documentService;
	@GetMapping("/all")
	public List<Document> getAllDocument() {
		return documentService.getAllDocumentService();
		
	}
	@RequestMapping("/{id}")
	public Document searchDocumentById(@PathVariable int id) {
		return documentService.searchDocumentByIdService(id);
	
	}
	@PostMapping("/add")
	public void addNewDocument(@RequestBody Document doc) {
		documentService.addNewDocumentService(doc);
	}
	

}
