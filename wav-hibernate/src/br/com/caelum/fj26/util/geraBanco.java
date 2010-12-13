package br.com.caelum.fj26.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class geraBanco {

	public static void main(String[] args) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		SchemaExport schemaExport = new SchemaExport(configuration);
		schemaExport.create(true, true);
//		schemaExport.setOutputFile("/home/mtzcpd39/HibernateExportDatabase.sql").create(true, false);
//		System.out.println("SchemaExport: " + schemaExport.);
//		SchemaUpdate schemaUpdate = new SchemaUpdate(configuration);
//		schemaUpdate.execute(true, true);
	}
}
