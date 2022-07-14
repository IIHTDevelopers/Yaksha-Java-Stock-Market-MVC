package com.iiht.stockExchange.UtilTestClass;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.iiht.stockExchange.entity.CompanyDetails;
import com.iiht.stockExchange.entity.StockPriceDetails;

public class MasterData 
{
	public static CompanyDetails getCompanyDetails() 
	{
		CompanyDetails companyDetails = new CompanyDetails();
		
		companyDetails.setCompanyCode(companyDetails.getCompanyCode());
		companyDetails.setStockExchange("BSE");
		companyDetails.setCompanyName("IIHT Pvt Ltd, Bangalore");
		companyDetails.setCompanyCEO("Praveen Kumar");
		companyDetails.setTurnover(65432.87);
		companyDetails.setBoardOfDirectors("AAA, BBB, CCC");
		companyDetails.setCompanyProfile("Base location is Bangalore, India");
		
		return companyDetails;
	}
	
	public static StockPriceDetails getStockPriceDetails() 
	{
		StockPriceDetails spDetails = new StockPriceDetails();
		
		spDetails.setStockIndex(spDetails.getStockIndex());
		spDetails.setCompanyCode((long)2001);
		spDetails.setCurrentStockPrice(55.76);

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		spDetails.setStockPriceDate(LocalDate.parse("08/07/2020", dateFormat));
		spDetails.setStockPriceTime(LocalTime.parse("10:30:00"));

		return spDetails;
	}
	
	public static Properties getProperties() throws IOException 
	{
		FileReader reader = new FileReader("src\\main\\resources\\database.properties");
		Properties properties = new Properties();
		properties.load(reader);
		return properties;
	}
	
	public static LocalSessionFactoryBean getSession() throws IOException 
	{
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		Properties properties = getProperties();
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(properties.getProperty("database.driver"));
		dataSource.setUrl(properties.getProperty("database.url"));
		dataSource.setUsername(properties.getProperty("database.root"));
		dataSource.setPassword(properties.getProperty("database.password"));
		
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan("com.forum.ForumProject.entity");
		
		properties.put("hibernate.dialect", properties.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
		
		lsfb.setHibernateProperties(properties);
		
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb;
	}
}