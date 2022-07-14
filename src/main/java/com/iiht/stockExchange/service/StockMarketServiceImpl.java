package com.iiht.stockExchange.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.stockExchange.dao.StockMarketDao;
import com.iiht.stockExchange.entity.StockPriceDetails;

@Service
@Transactional
public class StockMarketServiceImpl implements StockMarketService {

	@SuppressWarnings("unused")
	@Autowired
	private StockMarketDao stockMarketDao;
	
	@Override
	public Boolean saveStockDetails(StockPriceDetails stockPriceDetails) {
		return false;
	};
	@Override
	public List<StockPriceDetails> getAllStock() {
		 return null;
	};
	@Override
	public List<StockPriceDetails> getStockByCompanyCode(Long companyCode) {
		return null;
	};
	@Override
	public List<StockPriceDetails> getStockRange(Long companyCode, LocalDate from, LocalDate to) {
		return null;
	};
	
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