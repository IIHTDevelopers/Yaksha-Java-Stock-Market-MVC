package com.iiht.stockExchange.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.stockExchange.entity.StockPriceDetails;

@Repository
@Transactional
public class StockMarketDaoImpl implements StockMarketDao 
{
	@SuppressWarnings("unused")
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Boolean saveStockDetails(StockPriceDetails stockPriceDetails) {
		return null;		
	};
	@Override
	public List<StockPriceDetails> getAllStock() {
		return null;		
	};	
	@Override
	public List<StockPriceDetails> getStockByCompanyCode(Long companyCode) {
		return null;		
	};
	//-----------------------------------------------------------------------------------------------------------------------------
	@Override
	public List<StockPriceDetails> getStockRange(Long companyCode, LocalDate from, LocalDate to) {
		return null;		
	};
	//-----------------------------------------------------------------------------------------------------------------------------
	public Double getMaxStockPrice(Long companyCode, LocalDate from, LocalDate to) {
		return null;		
	};	
	public Double getAvgStockPrice(Long companyCode, LocalDate from, LocalDate to) {
		return null;		
	};
	public Double getMinStockPrice(Long companyCode, LocalDate from, LocalDate to) {
		return null;		
	};
}