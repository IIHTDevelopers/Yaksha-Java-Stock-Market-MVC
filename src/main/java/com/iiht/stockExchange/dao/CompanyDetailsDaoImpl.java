package com.iiht.stockExchange.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.stockExchange.entity.CompanyDetails;

@Repository
@Transactional
public class CompanyDetailsDaoImpl implements CompanyDetailsDao {
	
	@SuppressWarnings("unused")
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Boolean saveCompany(CompanyDetails companyDetails) {
		return true;
	};
	
	@Override
	public List<CompanyDetails> getAllCompanies(){
		return null;		
	};
	
	@Override
	public List<CompanyDetails> getAllCompaniesByExchange(String stockExchange){
		return null;		
	};
	
	@Override
	public Integer getCompanyCode(String companyName) {
		return null;		
	};
	
	@Override
	public CompanyDetails getCompanyInfoByCompanyCode(Long companyCode) {
		return null;		
	};
}