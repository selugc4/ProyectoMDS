/**
 * Licensee: jesus(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateA12DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.A12PersistentManager.instance());
			basededatos.A12PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
