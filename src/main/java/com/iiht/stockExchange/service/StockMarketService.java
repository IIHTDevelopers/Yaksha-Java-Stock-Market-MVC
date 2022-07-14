package com.iiht.stockExchange.service;

import java.time.LocalDate;
import java.util.List;

import com.iiht.stockExchange.entity.StockPriceDetails;

public interface StockMarketService {
	
	public Boolean saveStockDetails(StockPriceDetails stockPriceDetails);
	public List<StockPriceDetails> getAllStock();
	public List<StockPriceDetails> getStockByCompanyCode(Long companyCode);
	public List<StockPriceDetails> getStockRange(Long companyCode, LocalDate from, LocalDate to);
}