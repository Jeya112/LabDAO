package com.cg.healthassist.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This JPAUtil class performs common task like getting entityManager instance, releasing entityManger
 *
 */
public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory;
	
	/**
	 * Create the entity manager factory to produce the entity manager.
	 */
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
	/**
	 * Start the transaction.
	 */
	public void beginTransaction(EntityManager em) {
		em.getTransaction().begin();
	}
	
	/**
	 * Save all the changes in database.
	 */
	public void commitTransaction(EntityManager em) {
		em.getTransaction().commit();
	}
	
	/**
	 * Close the transaction.
	 */
	public void closeEntityManager(EntityManager em) {
		em.close();
	}

}


