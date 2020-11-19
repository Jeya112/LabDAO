package com.cg.healthassist.daoimpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.healthassist.dao.LaboratoryDAO;
import com.cg.healthassist.model.Laboratory;
import com.cg.healthassist.util.JPAUtil;

public class LaboratoryDAOImpl extends JPAUtil implements LaboratoryDAO{
	@Override
	public void persist(Laboratory laboratory) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		em.persist(laboratory);
		commitTransaction(em);
		closeEntityManager(em);
}
	
	@Override
	public Laboratory findByLaboratoryId(long laboratoryId) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Laboratory laboratory = em.find(Laboratory.class, laboratoryId);
		commitTransaction(em);
		closeEntityManager(em);
		return laboratory;
	}
	@Override
	public List<Laboratory> findAll() {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Query query = em.createQuery("from Laboratory");
		List<Laboratory> laboratoryList = query.getResultList();
		return laboratoryList;
	}
}
