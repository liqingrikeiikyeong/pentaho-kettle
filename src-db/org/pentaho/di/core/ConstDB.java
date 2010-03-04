package org.pentaho.di.core;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.database.SAPR3DatabaseMeta;

public class ConstDB {
	/**
	 * Select the SAP R/3 databases in the List of databases.
	 * @param databases All the databases
	 * @return SAP R/3 databases in a List of databases.
	 */
	public static final List<DatabaseMeta> selectSAPR3Databases(List<DatabaseMeta> databases)
	{
		List<DatabaseMeta> sap = new ArrayList<DatabaseMeta>();

		for (DatabaseMeta db : databases)
		{
			if (db.getDatabaseInterface() instanceof SAPR3DatabaseMeta) {
				sap.add(db);
			}
		}

		return sap;
	}

}
