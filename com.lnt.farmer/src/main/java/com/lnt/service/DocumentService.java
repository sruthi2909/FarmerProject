package com.lnt.service;

import java.util.List;

import com.lnt.domain.Document;

public interface DocumentService {
	
	List<Document> getAllDocumentService();
	Document searchDocumentByIdService(int id);
	void addNewDocumentService(Document doc);

}
