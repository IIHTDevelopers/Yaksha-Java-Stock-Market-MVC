package com.iiht.stockExchange.dao;

import java.time.LocalDate;
import java.util.List;

import com.iiht.stockExchange.entity.StockPriceDetails;

public interface StockMarketDao {
	
	public Boolean saveStockDetails(StockPriceDetails stockPriceDetails);
	public List<StockPriceDetails> getAllStock();	
	public List<StockPriceDetails> getStockByCompanyCode(Long companyCode);
	public List<StockPriceDetails> getStockRange(Long companyCode, LocalDate from, LocalDate to);
	public Double getMaxStockPrice(Long companyCode, LocalDate from, LocalDate to);
	public Double getAvgStockPrice(Long companyCode, LocalDate from, LocalDate to);
	public Double getMinStockPrice(Long companyCode, LocalDate from, LocalDate to);
}