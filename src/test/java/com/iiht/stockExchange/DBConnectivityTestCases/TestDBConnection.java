package com.iiht.stockExchange.DBConnectivityTestCases;
/*
import static com.iiht.stockExchange.UtilTestClass.TestUtils.*;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.iiht.stockExchange.UtilTestClass.MasterData;
import com.iiht.stockExchange.entity.CompanyDetails;

public class TestDBConnection 
{
	@Test
	public void testConnectivity() throws IOException 
	{
		boolean value = false;
		
		Properties properties = MasterData.getProperties();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		try {
		dataSource.setDriverClassName(properties.getProperty("database.driver"));
		dataSource.setUrl(properties.getProperty("database.url"));
		dataSource.setUsername(properties.getProperty("database.root"));
		dataSource.setPassword(properties.getProperty("database.password"));		
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
			return;
		}
	    if(dataSource != null)
	    	value = true;

	    yakshaAssert(currentTest(), value ? true : false, businessTestFile);	    
	}
    //----------------------------------------------------------------------------------------------
	@Test
	public void testHibernateProperties() throws IOException 
	{
		boolean value = false;
		
		Properties properties = MasterData.getProperties();
		try {
		properties.put("hibernate.dialect", properties.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
			return;
		}
		
		if(properties != null)
			value = true;

	    yakshaAssert(currentTest(), value ? true : false, businessTestFile);
	}
    //----------------------------------------------------------------------------------------------	
	/*@SuppressWarnings({ "unchecked", "deprecation" })
	@Test 
	public void testSqlException() throws IOException 
	{ 
		boolean value = false;
		
		HibernateTemplate session = new HibernateTemplate(MasterData.getSession().getObject()); 
		String hql = "FROM CompanyDetails";
	  
		List<CompanyDetails> size = (List<CompanyDetails>) session.find(hql, Object[].class); 

		if(size != null)
			value = true;
		
	    yakshaAssert(currentTest(), value ? true : false, businessTestFile);
	}
}*/
