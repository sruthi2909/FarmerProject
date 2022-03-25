package com.lnt.repository;

import java.util.List;

import com.lnt.domain.Document;



public interface DocumentDao {
	List<Document> getAllDocument();
	Document searchDocumentById(int id);
	void addNewDocument(Document doc);

}
