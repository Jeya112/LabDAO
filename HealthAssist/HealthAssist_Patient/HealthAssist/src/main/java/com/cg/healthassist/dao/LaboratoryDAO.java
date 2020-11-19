package com.cg.healthassist.dao;

import com.cg.healthassist.model.Laboratory;
import java.util.List;

public interface LaboratoryDAO {
	/**
	 * This method will save the data of the Laboratory in database.
	 * @param Laboratory, Instance of Laboratory to persist.
	 */
	public void persist(Laboratory laboratory);
	/**
	 * Search the laboratory with given id in the database.
	 * @param id of the laboratory to search.
	 * @return the instance of laboratory if present else return null.
	 */
	public Laboratory  findByLaboratoryId(long laboratoryId);
	/**
	 * Give all the instances of laboratories present inside database.
	 * @return the list of laboratory instances.
	 */
	public List<Laboratory> findAll();
	
}
	


