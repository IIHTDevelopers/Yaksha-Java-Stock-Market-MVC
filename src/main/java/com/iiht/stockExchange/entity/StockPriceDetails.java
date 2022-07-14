package com.iiht.stockExchange.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "StockPriceDetails")
public class StockPriceDetails implements Serializable {

	private static final long serialVersionUID = 1558661735734686934L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "stockIndex")
	private Long stockIndex;
	
	
	@Column(name = "companyCode")
	private Long companyCode;									// To which Company this Stock Price Info belongs to

	
	@Column(name = "currentStockPrice", precision=10, scale=2)
	private Double currentStockPrice;							// Stock Price
	
	
	@Column(name = "stockPriceDate")
	private LocalDate stockPriceDate;							// Date of the Stock Price
	
	
	@Column(name = "stockPriceTime", columnDefinition = "TIME")
	private LocalTime stockPriceTime;								// Stock Price at this Specific


	public Long getStockIndex() {
		return stockIndex;
	}


	public void setStockIndex(Long stockIndex) {
		this.stockIndex = stockIndex;
	}


	public Long getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(Long companyCode) {
		this.companyCode = companyCode;
	}


	public Double getCurrentStockPrice() {
		return currentStockPrice;
	}


	public void setCurrentStockPrice(Double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}


	public LocalDate getStockPriceDate() {
		return stockPriceDate;
	}


	public void setStockPriceDate(LocalDate stockPriceDate) {
		this.stockPriceDate = stockPriceDate;
	}


	public LocalTime getStockPriceTime() {
		return stockPriceTime;
	}


	public void setStockPriceTime(LocalTime stockPriceTime) {
		this.stockPriceTime = stockPriceTime;
	}
	
	
}