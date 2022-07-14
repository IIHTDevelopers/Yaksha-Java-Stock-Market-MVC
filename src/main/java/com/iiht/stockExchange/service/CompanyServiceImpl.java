package com.iiht.stockExchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.stockExchange.dao.CompanyDetailsDao;
import com.iiht.stockExchange.entity.CompanyDetails;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
	
	@SuppressWarnings("unused")
	@Autowired
	private CompanyDetailsDao companyDetailsDao;
	
	public Boolean saveCompany(CompanyDetails companyDetails) {
		return false;
	};

	public List<CompanyDetails> getAllCompanies() {
		return null;
	};
	
	public List<CompanyDetails> getAllCompaniesByExchange(String stockExchange) {
		return null;
	};
	
	public Integer getCompanyCode(String companyName){
		return null;
	};

	public CompanyDetails getCompanyInfoByCompanyCode(Long companyCode){
		return null;
	};	
}