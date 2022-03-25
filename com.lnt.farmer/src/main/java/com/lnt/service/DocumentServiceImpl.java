package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.Document;
import com.lnt.repository.DocumentDao;
@Component
@Transactional
public class DocumentServiceImpl implements DocumentService{
	@Autowired
	private DocumentDao documentDao;
	//in-order to override Dao class method -->create Dao class instance

	
	public List<Document> getAllDocumentService() {
		// TODO Auto-generated method stub
		return documentDao.getAllDocument();
	}

	
	public Document searchDocumentByIdService(int id) {
		// TODO Auto-generated method stub
		return documentDao.searchDocumentById(id);
	}


	public void addNewDocumentService(Document doc) {
		// TODO Auto-generated method stub
		documentDao.addNewDocument(doc);
		
	}
	

	
}
