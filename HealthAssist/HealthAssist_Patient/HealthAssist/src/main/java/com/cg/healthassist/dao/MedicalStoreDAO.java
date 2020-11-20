package com.cg.healthassist.dao;

import java.util.List;

import com.cg.healthassist.model.MedicalStore;

/**
 * An interface to provide the declaration of all CRUD operation related with Medical store.
 * @author Aman Soni
 *
 */
public interface MedicalStoreDAO {
	
	/**
	 * This method will save the data of the medical store in database.
	 * @param medicalStore, Instance of medical store to persist.
	 */
	public void persist(MedicalStore medicalStore);
	
	/**
	 * Search the medical store with given id in the database.
	 * @param id of the medical store to search.
	 * @return the instance of medical store if present else return null.
	 */
	public MedicalStore findByMedicalStoreId(long medicalStoreId);
	
	/**
	 * Give all the instances of medical store present inside database.
	 * @return the list of medical store instances.
	 */
	public List<MedicalStore> findAll();
}

