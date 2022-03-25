package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Document;

@Repository
public class DocumentDaoImpl implements DocumentDao{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Document> getAllDocument() {
		// TODO Auto-generated method stub
		return em.createQuery("select d from Document d",Document.class).getResultList();
	}

	@Override
	public Document searchDocumentById(int id) {
		// TODO Auto-generated method stub
		return em.find(Document.class, id);
	}

	@Override
	public void addNewDocument(Document doc) {
		// TODO Auto-generated method stub
		em.persist(doc);
	}
	

}
