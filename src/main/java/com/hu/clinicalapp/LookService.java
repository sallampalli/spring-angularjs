/**
 * 
 */
package com.hu.clinicalapp;

import com.hu.clinicalapp.domain.Doctor;

/**
 * @author AllSa002 This class will get so and so ouput, this is intededfor
 *         handling all the interaction with DAO to get info rewuire dofr mp
 *         class
 * 
 * 
 */
public class LookService {

	/**
	 * This method is gettin a docjkbadkljfblakdjfakl
	 * 
	 * @param id
	 *            - This id is a doctor id that you have to pass
	 * @return - You will get a Doctor object
	 * @throws NullPointerException
	 *             , IllegalArgumentException
	 */
	public Doctor getMeDoctor(Long id) throws Exception {
		Doctor d = null;
		//If the doctor is not there then throwing an error code
		if (d != null) {
			throw new IllegalArgumentException(
					"You cannot enter null value for this parameter");
		}
		return d;
	}

}
