package com.iiht.stockExchange.service;

import java.util.List;

import com.iiht.stockExchange.entity.CompanyDetails;

public interface CompanyService {
	
	public Boolean saveCompany(CompanyDetails companyDetails);
	public List<CompanyDetails> getAllCompanies();
	public List<CompanyDetails> getAllCompaniesByExchange(String stockExchange);
	public Integer getCompanyCode(String companyName);
	public CompanyDetails getCompanyInfoByCompanyCode(Long companyCode);
}
